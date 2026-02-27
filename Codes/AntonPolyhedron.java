import java.util.*;

public class AntonPolyhedron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); 

        
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Tetrahedron", 4);
        map.put("Cube", 6);
        map.put("Octahedron", 8);
        map.put("Dodecahedron", 12);
        map.put("Icosahedron", 20);

        int totalFaces = 0;

        for(int i = 0; i < n; i++){
            String polyhedron = sc.nextLine();
            totalFaces += map.get(polyhedron);
        }

        System.out.println(totalFaces);
    }
}