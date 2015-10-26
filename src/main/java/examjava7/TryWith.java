package examjava7;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class TryWith {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        URL url = new URL("http://www.nu.nl");

        try (OutputStream out = new FileOutputStream("myfile.html");
                InputStream is = url.openStream();) {
            byte[] buf = new byte[4096];
            int len;
            while ((len = is.read(buf)) > 0) {
                out.write(buf, 0, len);
            }
        }
    }

    public static void writeToFileZipFileContents(String zipFileName,
            String outputFileName) throws IOException {

        java.nio.charset.Charset charset
                = java.nio.charset.StandardCharsets.US_ASCII;
        java.nio.file.Path outputFilePath
                = java.nio.file.Paths.get(outputFileName);

    // Open zip file and create output file with 
        // try-with-resources statement
        try (
                java.util.zip.ZipFile zf
                = new java.util.zip.ZipFile(zipFileName);
                java.io.BufferedWriter writer
                = java.nio.file.Files.newBufferedWriter(outputFilePath, charset)) {
            // Enumerate each entry
            for (java.util.Enumeration entries
                    = zf.entries(); entries.hasMoreElements();) {
                // Get the entry name and write it to the output file
                String newLine = System.getProperty("line.separator");
                String zipEntryName
                        = ((java.util.zip.ZipEntry) entries.nextElement()).getName()
                        + newLine;
                writer.write(zipEntryName, 0, zipEntryName.length());
            }
        }
    }
}
