package correct;

public class Downloader {

    private String url;

    public Downloader(String url) {
        this.url = url;
    }

    public String downloadData() {
        System.out.println("Data downloading from " + url + "...");
        return "data";
    }
}
