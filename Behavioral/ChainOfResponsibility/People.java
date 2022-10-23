class Parent extends Responsible {
	@Override
	public boolean beAbleToJudge(String question, int questionLevel) {
		if (questionLevel < 2) {
			return true;
		}
		return false;
	}

	@Override
	public void judge(String question) {
		System.out.println("Parent judge it.");
	}
}

class Teacher extends Responsible {
	@Override
	public boolean beAbleToJudge(String question, int questionLevel) {
		if (questionLevel < 3) {
			return true;
		}
		return false;
	}

	@Override
	public void judge(String question) {
		System.out.println("Teacher judge it.");
	}
}

class HeadTeacher extends Responsible {
	@Override
	public boolean beAbleToJudge(String question, int questionLevel) {
		if (questionLevel < 4) {
			return true;
		}
		return false;
	}

	@Override
	public void judge(String question) {
		System.out.println("Headteacher judge it.");
	}
}
