public class Flourescent extends Light {

        private int lumens;

        public Flourescent(){
            this.lumens = 0;
        }
        public Flourescent(int lumens) {
            this.lumens = lumens;
        }
    /*
            public int getLumens() {
                return this.lumens;
            }
        */
    @Override
    public double heatOutput() {
        return 0;
    }

    @Override
    public boolean isFlourescent(){
        return true;
    }


}


