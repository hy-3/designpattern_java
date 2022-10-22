class FullTimeTeacher implements Teacher{
	@Override
	public void teachMath() {
		System.out.println("FullTime Teacher: teaching Math.");
	}
	
	@Override
	public void teachEnglish() {
		System.out.println("FullTime Teacher: teaching English.");
	}

	@Override
	public void teachHistory() {
		System.out.println("FullTime Teacher: teaching History.");
	}
}

class PartTimeTeacher implements Teacher{
	private FullTimeTeacher fullTimeTeacher = new FullTimeTeacher();

	@Override
	public void teachMath() {
		System.out.println("PartTime Teacher: teaching Math.");
	}
	
	@Override
	public void teachEnglish() {
		System.out.println("Part-time teacher can't teach so wait till tomorrow.");
		fullTimeTeacher.teachEnglish();
	}

	@Override
	public void teachHistory() {
		System.out.println("Part-time teacher can't teach so wait till tomorrow.");
		fullTimeTeacher.teachHistory();
	}
}