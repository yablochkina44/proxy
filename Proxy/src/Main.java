public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Hello world!");
        Loader RuTube = new ProxyLoader();
        RuTube.loadInVideo("https://rutube.ru/memes2020");
        RuTube.loadInVideo("https://rutube.ru/memes2021");
        RuTube.loadInVideo("https://rutube.ru/memes2022");
        RuTube.loadInVideo("https://rutube.ru/animalworld");
    }
}