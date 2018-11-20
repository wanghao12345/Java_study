package section06.course01.demo02;

public class MainClass {
    /**
     * 示例：三个售票窗口同时出售10张票
     * @param args
     */
    public static void main(String[] args) {
        Station station1 = new Station("窗口1");
        Station station2 = new Station("窗口2");
        Station station3 = new Station("窗口3");

        station1.start();
        station2.start();
        station3.start();
    }
}
