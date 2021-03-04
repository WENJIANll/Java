package designPattern;

public class Builderr {
    House house = new House.Builder().setWindow(new Window()).setDoor(new Door()).setWall(new Wall()).build();
}

//窗户、门、墙、屋顶
class Window{}
class Door{}
class Wall{}
class Roof{}

class House{
    private Window window;
    private Door door;
    private Wall wall;
    private Roof roof;

    House(Builder builder){
        this.window = builder.window;
        this.door = builder.door;
        this.wall = builder.wall;
        this.roof = builder.roof;
    }

    static final class Builder{
        private Window window;
        private Door door;
        private Wall wall;
        private Roof roof;

        public  Builder setWindow(Window window) {
            this.window = window;
            return this;
        }

        public Builder setDoor(Door door) {
            this.door = door;
            return this;
        }

        public Builder setWall(Wall wall) {
            this.wall = wall;
            return this;
        }

        public Builder setRoof(Roof roof) {
            this.roof = roof;
            return this;
        }

        public House build(){
            return new House(this);
        }

    }
}
