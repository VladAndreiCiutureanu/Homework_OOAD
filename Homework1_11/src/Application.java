import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Dreapta dreapta = new Dreapta(3);
        System.out.println(dreapta);

        Patrat patrat1 = new Patrat(3);
        Patrat patrat2 = new Patrat(4);
        Patrat patrat3 = new Patrat(5);

        Cerc cerc1 = new Cerc(3);
        Cerc cerc2 = new Cerc(4);
        Cerc cerc3 = new Cerc(5);

        Sfera sfera1 = new Sfera(3);
        Sfera sfera2 = new Sfera(4);
        Sfera sfera3 = new Sfera(5);

        Cub cub1 = new Cub(3);
        Cub cub2 = new Cub(4);
        Cub cub3 = new Cub(5);


        ArrayList<Shape> shapes = new ArrayList<>(List.of(patrat1, patrat2, patrat3, cerc1, cerc2, cerc3, sfera1, sfera2, sfera3, cub1, cub2, cub3));
        for(Shape shape : shapes){
            if(shape instanceof Shape2D shape2D){
                System.out.println(shape.getPerimetru());
            }
        }

        for(Shape shape : shapes){
            if(shape instanceof Shape2D shape2D){
                System.out.println(shape2D.getArie());
            }
        }

        for(Shape shape : shapes){
            if(shape instanceof Shape3D shape3D){
                System.out.println(shape3D.getVolum());
            }
        }
    }
}
