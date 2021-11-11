import java.io.*;
import java.util.*;

public class chanukah {
    public static void main(String[] args) throws Exception {

        BufferedReader al = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter vin = new BufferedWriter(new OutputStreamWriter(System.out));

        int cases = Integer.parseInt(al.readLine());
        while (cases-- > 0) {
            String[] tokens = al.readLine().split(" ");
            int n = Integer.parseInt(tokens[1]);
            vin.write(tokens[0] + " " + (n * (n + 1) / 2 + n) + "\n");
        }

        vin.close();
        al.close();
    }
}