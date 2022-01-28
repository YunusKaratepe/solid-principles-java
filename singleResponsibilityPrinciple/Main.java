import correct.Downloader;
import correct.Parser;
import correct.Saver;
import wrong.WDownloader;

public class Main {
    public static void main(String[] args) {
        
        WDownloader wdownloader = new WDownloader("url.com");
        wdownloader.downloadData();
        wdownloader.parseData();
        wdownloader.saveData();

        Downloader downloader = new Downloader("url.com");
        Parser parser = new Parser();
        Saver saver = new Saver();

        String data = downloader.downloadData();
        parser.parseData(data);
        saver.saveData(data);


    }
}
