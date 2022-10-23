class ConcretePrototype1 extends Prototype {
	@Override
	public Prototype clone() throws CloneNotSupportedException{
		return (ConcretePrototype1)super.clone();
	}
}

class ConcretePrototype2 extends Prototype {
	@Override
	public Prototype clone() throws CloneNotSupportedException{
		return (ConcretePrototype2)super.clone();
	}
}
