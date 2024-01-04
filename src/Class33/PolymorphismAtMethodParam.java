package Class33;

public class PolymorphismAtMethodParam{
    public static void main(String[] args) {
Chrome onj = new Chrome();
        openWebsiteFromAnyBrowser(onj, "google.com");
    }
//    be able to open Website from any browser
    public static void openWebsiteFromAnyBrowser(Browser browser, String url){
        browser.openWebsite(url);
    }
}
//create a prog that will dynamically create browsers
//I have Chrome and Safari browser
//All browsers should have common methods like
//openWebsite(String URL)-> should be overriden by both browsers

//Chrome browser should have clear cache method

//Safari should have private browsing method

class Browser{
    public void openWebsite(String url){
        System.out.println("Opening website in a generic browser");
    }
}
class Chrome extends Browser{
@Override
public void openWebsite(String url){
    System.out.println("Opening website in a Chrome browser");
}
public void clearCache(){
    System.out.println("Clearing cache in Chrome browser");
}
}
class Safari extends Browser{
@Override
public void openWebsite(String url){
    System.out.println("Opening website in a Safari browser");
}
public void privateBrowsing(){
    System.out.println("Privately Browsing in Safari");
}
}