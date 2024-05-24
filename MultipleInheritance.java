interface Camera {
    void clickPicture();
    void recordVideo ();
}

interface MusicPlayer{
    void playMusic();
    void pauseMusic();
}

class MyPhone implements Camera,MusicPlayer{

    public void clickPicture(){
        System.out.println("Clicking selfie :) ");
    }
    public void recordVideo (){
        System.out.println("Recording video in 4k Quality....");
    }

    public void playMusic(){
        System.out.println("Playing your favourite song!!");
    }
    public void pauseMusic(){
        System.out.println("Song Paused..");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {

        MyPhone obj_MultipleInheritance = new MyPhone();
        obj_MultipleInheritance.clickPicture();
        obj_MultipleInheritance.recordVideo();
        obj_MultipleInheritance.playMusic();
        obj_MultipleInheritance.pauseMusic();
    }
}
