package Homework;

public class Cosmodrome {

    public void launch(IStart istart) {
        if (!istart.systemCheck()) {
            System.out.println("Prelaunch check failed");
        } else {
            timer();
            istart.engineStart();
            istart.start();

            System.out.println("Start");
        }
    }
    private void timer() {
        for (int i = 10; i > 0 ; i--) {
            System.out.println("otschet -" + i);

        }
    }


}
