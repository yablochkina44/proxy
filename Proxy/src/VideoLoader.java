import java.util.ArrayList;

public class VideoLoader implements Loader {
    String url;
    ArrayList<String> videoArr;

    public  VideoLoader(){
        videoArr = new ArrayList<String>();
    }

    @Override
    public String loadInVideo(String url) throws InterruptedException {
        if(videoArr.indexOf(url) == -1){
            videoArr.add(url);
        }
        System.out.println("Загрузка видео по ссылке: "+ url);
        Thread.sleep(1000);
        return videoArr.get(videoArr.indexOf(url));
    }
}
