public class Flourescent extends Light {

    public int lumens;

    public Flourescent(){
        lumens = 0;
        }
    public Flourescent(int lumens) {
        this.lumens = lumens;
    }


    @Override
    public double heatOutput() {
        return 0;
    }

    @Override
    public boolean isFlourescent(){
        return true;
    }


}


