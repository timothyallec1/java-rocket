public class DrawRocket {  //this program uses methods and parameters to construct a rocket ship with limited redundancy
                                                                   //I did not work on this code with any other students
    public static Integer SIZE = 6;                                     // This parameter affects the size of the rocket
    private static void printString(String s, int count){    //reduces redundancy of using for loops to print the rocket
        for (int i = 1; i <= count; i++){
            System.out.print(s);
        }
    }

    public static void main(String[] args){   //methods called in this specific order to print the desired rocket design
            drawPoint();
            drawBoarder();
            drawBase1();
            drawBase2();
            drawBoarder();
            drawBase2();
            drawBase1();
            drawBoarder();
            drawPoint();
        }

        public static void drawPoint(){      //prints the top and bottom of the rocket, resembles a structured pyramid
            for (int line = 1; line <= 2 * SIZE -1; line++){
                printString(" ", -1 * line + (2 * SIZE));
                printString("/", 1 * line);
                System.out.print("*++*");
                printString("\\", 1 * line);
                System.out.println();
            }
        }

        public static void drawBoarder(){                    //prints the boarder dividing different parts of the rocket
            System.out.print("**");
            printString("=+", 2 * SIZE);
            System.out.println("**");
        }

        public static void drawBase1(){                 //prints the part including a design with two upside-down pyramids
            for (int line = 1; line <= SIZE; line++){
                System.out.print("||");
                printString(".", 1 * line - 1);
                printString("\\/", -1 * line + (SIZE + 1));
                printString(".", 2 * line - 2);
                printString("\\/", -1 * line + (SIZE + 1));
                printString(".", 1 * line - 1);
                System.out.println("||");
            }
        }

        public static void drawBase2(){          //prints the part which including a design of two right-side up triangles
            for (int line = 1; line <= SIZE; line++){
                System.out.print("||");
                printString(".", -1 * line + SIZE);
                printString("/\\", 1* line);
                printString(".", -2 * line + (SIZE * 2));
                printString("/\\", 1* line);
                printString(".", -1 * line + SIZE);
                System.out.println("||");
            }
        }
}