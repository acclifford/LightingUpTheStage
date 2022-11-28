public class Incandescent extends Light {

    private int lumens;

    public Incandescent(){
        lumens = 0;
    }

    public Incandescent(int lumens){
        this.lumens = lumens;
    }

    @Override
    public double heatOutput(){
       return this.lumens * 87.4;
    }

    @Override
    public boolean isFlourescent(){
        return false;
    }




}
