
class Shape{
       public void draw() {
           System.out.println("Drawing a shape");}
       public void erase() {
           System.out.println("erasing a shape");}}
class Circle extends Shape{
    @Override
    public void draw() {
        System.out.println("Drawing a circle");}
    public void erase() {
        System.out.println("Erasing a circle");}}
class Triangle extends Shape{
    @Override
    public void draw() {
        System.out.println("Drawing a tringle");}
    public void erase(){
        System.out.println("erasing a triangle");}}
 class Square extends Shape{
    @Override
    public void draw() {
        System.out.println("Drawing a square");}
    public void erase(){
        System.out.println("erasing a square");}}
public class I6{
    public static void main(String[] args) {
        Shape[] shapes=new Shape[3];
        shapes[0]=new Circle();
        shapes[1]=new Triangle();
        shapes[2]=new Square();
        for(int i=0;i<shapes.length;i++){
            shapes[i].draw();
            shapes[i].erase();
            System.out.println("------------");}}}
        



       

