import java.io.*;
import java.net.*;


public class Main {

    public static void main(String[] args) throws IOException {


        final String host = "https://docs.google.com/forms/u/0/d/e/1FAIpQLScE6sxLFb3BmCmT2TKHQH5ormS0qvjHwO-uTAR8MXaagBvSSQ/formResponse";
        URL url = new URL(host);
        URLConnection conn = url.openConnection();
        conn.setDoOutput(true);

//      1.Dades separades
        OutputStreamWriter out = new OutputStreamWriter(conn.getOutputStream());
        out.write("entry.835030737=" + "Toni&");
        out.write("entry.1616686619=" + "Si");
        out.close();
        conn.getInputStream();

//      2.Dades Unificada
//        DataOutputStream out = new DataOutputStream(conn.getOutputStream());
//        out.writeBytes("entry.835030737=Antonio&entry.1616686619=No&");
//        DataInputStream in = new DataInputStream(conn.getInputStream());
//        String resposta = in.readUTF();
//        System.out.println("resposta: " + resposta);



    }
}
