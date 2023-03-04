package veltin.aew.nois;

public class SmartTv {
    private boolean isOn = false;
    private int channel;
    private int volume = 0;

    public void touggleTV() {
        this.isOn = !this.isOn;
    };

    public void increaseVolume() {
        this.volume = this.volume + 1;
    };

    public void decreaseVolume() {        
        this.volume = this.volume - 1;
    }

    public void changeChannel(int newChannel){
        this.channel = newChannel != 0 ? newChannel : this.channel + 1;
    };

    public int getChannel(){
        return this.channel;
    }

};

