package blast;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class CallBlast
    {
    private String blastAllPath="$HOME/build/blast-2.2.26/bin/blastall";
    private String blastDB="$HOME/build/blast-2.2.26/data/UniVec";
    private blast.BlastOutput run(String name,String sequence) throws IOException
        {
        File fasta=File.createTempFile("blast", ".fa");
        File blast=File.createTempFile("blast", ".xml");
        try
            {
            PrintWriter out=new PrintWriter(fasta);
            out.println(">"+name);
            out.println(sequence.replaceAll("[0-9 \t\n\r]",""));
            out.flush();
            out.close();


            ProcessBuilder pb = new ProcessBuilder(
                this.blastAllPath,
                "-p","blastn",
                "-d",blastDB,
                "-m","7",
                "-i",fasta.getAbsolutePath(),
                "-o",blast.getAbsolutePath()
                );
            Process proc = pb.start();
            if(proc.waitFor()!=0) throw new RuntimeException("error occured");
            JAXBContext jc = JAXBContext.newInstance("blast");

            Unmarshaller u = jc.createUnmarshaller();
            u.setSchema(null);



            /** read the result */

             return  (blast.BlastOutput)u.unmarshal(blast);

            }
        catch(Exception err)
            {
            throw new RuntimeException(err);
            }
        finally
            {
            //blast.delete();
            //fasta.delete();
            }
        }
    public static void main(String[] args)
        {
        try {
            CallBlast app=new CallBlast();
            blast.BlastOutput blast=app.run("MYSequence","ACAATACCTCCACCGCCATGCCTTTAAAATTTTACTTCTTCCGCCAAGCTCCTCCCC");
            BlastOutputIterations iterations=blast.getBlastOutputIterations();
            for(Iteration iteration:iterations.getIteration())
                {
                IterationHits hits=iteration.getIterationHits();
                for(Hit hit:hits.getHit())
                    {
                    System.out.println("def:"+hit.getHitDef());
                    System.out.println("len:"+hit.getHitLen());
                    System.out.println();
                    }
                }
            }
        catch (Exception e)
            {
            e.printStackTrace();
            }
        }
    }

