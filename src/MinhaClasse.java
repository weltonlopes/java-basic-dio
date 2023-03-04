import veltin.aew.nois.SmartTv;

public class MinhaClasse {

    public static void main(String [] args) {
        SmartTv myTv = new SmartTv();

        myTv.touggleTV();

        myTv.changeChannel(13);
        
        System.out.println("myTv: " + myTv.getChannel());
    };
}
