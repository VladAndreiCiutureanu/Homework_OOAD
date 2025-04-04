public class Car {

    private String engine;
    private String model;

    private boolean hasAutoPilot;
    private boolean hasHeatedSeats;


    public String getEngine() {
        return engine;
    }

    public String getModel() {
        return model;
    }

    public boolean isHasAutoPilot() {
        return hasAutoPilot;
    }

    public boolean isHasHeatedSeats() {
        return hasHeatedSeats;
    }

    public Car(CarBuilder builder) {
        this.engine = builder.engine;
        this.model = builder.model;
        this.hasAutoPilot = builder.hasAutoPilot;
        this.hasHeatedSeats = builder.hasHeatedSeats;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", model='" + model + '\'' +
                ", hasAutoPilot=" + hasAutoPilot +
                ", hasHeatedSeats=" + hasHeatedSeats +
                '}';
    }

    public static class CarBuilder {
        private String engine;
        private String model;

        private boolean hasAutoPilot;
        private boolean hasHeatedSeats;


        public CarBuilder(String engine, String model) {
            this.engine = engine;
            this.model = model;
        }

        public CarBuilder setAutoPilot(boolean hasAutoPilot) {
            this.hasAutoPilot = hasAutoPilot;
            return this;
        }

        public CarBuilder setHeatedSeats(boolean hasHeatedSeats) {
            this.hasHeatedSeats = hasHeatedSeats;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
