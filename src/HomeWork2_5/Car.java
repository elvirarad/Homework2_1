package HomeWork2_5;

    public final class Car extends Transport<DriverB> implements Competing {
        private BodyType bodyType;

        public Car(String brand,
                   String model,
                   float engineVolume,
                   DriverB driver,
                   BodyType bodyType) {
            super(brand, model, engineVolume, driver);
            this.bodyType = bodyType;
        }
        //DriverB driver - новая переменная

        public BodyType getBodyType() {
            return bodyType;
        }

        public void setBodyType(BodyType bodyType) {
            this.bodyType = bodyType;
        }

        @Override
        public void startMoving(){
            System.out.println("1. " + getBrand() + " " + getModel() + " Включею зажигание");
            System.out.println("2. На старте " );
            System.out.println("3. Стартую");
        }

        @Override
        public void finishTheMoving(){
            System.out.println("1." + getBrand() + " "+ getModel()+ " финишировал");
        }

        @Override
        public void printType() {
            if (bodyType == null){
                System.out.println("Данных по автомобилю недостаточно");
            } else {
                System.out.println(bodyType);
            }
        }

        @Override
        public String toString() {
            return getBrand() +
                    " " + getModel() +
                    ", объем двигателя = " + getEngineVolume() + "л.";
        }

        @Override
        public void getPitStop() {
            System.out.println("проводим PitStop автомобиля");
        }

        @Override
        public void getBestLapTime() {
            int minBound = 90;
            int maxBound = 180;
            int theBestLapTimeInMins = (int) (minBound + (maxBound - minBound) * Math.random());
            System.out.println("лучшее время автомобиля в минутах = " + theBestLapTimeInMins);
        }

        @Override
        public void getMaxSpeed() {
            int minBound = 90;
            int maxBound = 180;
            int maxSpeed = (int) (minBound + (maxBound - minBound) * Math.random());
            System.out.println("максимальная скорость автомобиля: " + maxSpeed);
        }
}
