class Grading {

    public static void main(String[] args) {
        for (int grade = 1; grade <= 100; grade++) {
            System.out.println("grade = " + round(grade));
        }
    }

    private static int round(int grade) {

        // if the value of grade is less than 38, no rounding occurs as the result will still be a failing grade.
        if (grade < 38) return grade;

        int nextMultipleOfFive = nextMultipleOfFive(grade);

        // if the difference between the grade and the next multiple of 5 is less than 3, round grade up to the next multiple of 5.
        if (nextMultipleOfFive - grade < 3) grade = nextMultipleOfFive;

        return grade;
    }

    public static int nextMultipleOfFive(int number) {
        number++;

        while ((number % 5) != 0) number++;

        return number;
    }
}