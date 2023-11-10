import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(args[0]));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String [] d = new String[0];
        try {
            d = br.readLine().split(" ");
        } catch (IOException e) {
            e.printStackTrace();
        }

        float c1 = Float.parseFloat(d[0]),
                c2 = Float.parseFloat(d[1]),
                r = Float.parseFloat(br.readLine());

        BufferedReader br2 = null;
        try {
            br2 = new BufferedReader(new FileReader(args[1]));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while (true)
        {
            String strLine = null;
            try {
                strLine = br2.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

            if (strLine==null)
                break;
            String [] c = strLine.split(" ");

            float u = (c1 - Float.parseFloat(c[0])) * (c1 - Float.parseFloat(c[0]))
                    + (c2 - Float.parseFloat(c[1])) * (c2 - Float.parseFloat(c[1]));

            if (u == Math.pow(r,2))
                System.out.println(0 + " - точка лежит на окружности");
            else if (u < Math.pow(r,2))
                System.out.println(1 + " - точка внутри");
            else
                System.out.println(2 + " - точка снаружи");
        }
        try {
            br2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



