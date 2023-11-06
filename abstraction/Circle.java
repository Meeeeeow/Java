package abstraction;

public class Circle extends Shapes{
	 private int lines;
	 public Circle(int lines)
	 {
		 this.lines = lines;
	 }
	 public void setLines(int lines)
	 {
		 this.lines = lines;
	 }
	 public int getLines() {
		 return lines;
	 }
	 public void drawing() {
		 System.out.println("drawing circle");
	 }
	 public int linesTaken() {
		 return this.lines + 2;
	 }
}
