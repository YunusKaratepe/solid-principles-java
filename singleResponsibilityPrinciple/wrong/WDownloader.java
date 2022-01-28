package wrong;

public class WDownloader {

    private String url;
    private String data;

    public WDownloader (String url){
        this.url = url;
    }

    
    public String getUrl() {
        return url;
    }

    public void downloadData() {
        System.out.println("Data is downloading...");
        this.data = "downloaded_data";
    }

    public void parseData() {
        System.out.println("Data parsed...");
        this.data = "parsed_data";
    }

    public void saveData() {
        System.out.println("Data saved to file...");
    }

}
