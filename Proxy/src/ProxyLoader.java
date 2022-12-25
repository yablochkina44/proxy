import java.util.ArrayList;
import java.util.List;


public class ProxyLoader implements Loader{
    String url;
    VideoLoader videoLoader;
    ArrayList<String> videoArr;


    public ProxyLoader() {
        videoArr = new ArrayList<String>();
        videoLoader = new VideoLoader();

        videoArr.add("https://rutube.ru/memes2019");
        videoArr.add("https://rutube.ru/memes2018");

    }
    @Override
    public String loadInVideo(String url) throws InterruptedException {
        if(videoArr.indexOf(url) == -1) {
            videoArr.add(videoLoader.loadInVideo(url));

        }
        System.out.println("Загрузка  " + url);
        Thread.sleep(1000);
        System.out.println("Загрузка завершена");
        return videoArr.get(videoArr.indexOf(url));
    }
}

