public class Demo {
	public static void main(String[] args) {
		Ellipse ellipse1 = new Ellipse();
		Ellipse ellipse2 = new Ellipse();
		Ellipse ellipse3 = new Ellipse();
		Ellipse ellipse4 = new Ellipse();
		Square square1 = new Square();
		Square square2 = new Square();
		Square square3 = new Square();

		CompositeGraphic compositeGraphic1 = new CompositeGraphic();
		compositeGraphic1.add(square1);
		compositeGraphic1.add(square2);
	
		CompositeGraphic compositeGraphic2 = new CompositeGraphic();
		compositeGraphic2.add(ellipse1);
		compositeGraphic2.add(ellipse2);
		compositeGraphic2.add(ellipse3);

		CompositeGraphic compositeGraphic3 = new CompositeGraphic();
		compositeGraphic3.add(ellipse4);
		compositeGraphic3.add(square3);

		CompositeGraphic compositeGraphic = new CompositeGraphic();
		compositeGraphic.add(compositeGraphic1);
		compositeGraphic.add(compositeGraphic2);
		compositeGraphic.add(compositeGraphic3);

		compositeGraphic.print();
	}
}