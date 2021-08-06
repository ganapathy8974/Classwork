package day29;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

//This is comparator demo with tree set. This is always shorting the obj..
//because the tree set always shorting before storing the value. but our case we shoring the obj.
//so it's not short this throws u a class casing error. over come this issue u should create a comparator class for compare two objs. 
//It's done shoring and returns you a shorted value. then three short store the value..
//To string method helps your to print the objs in custom way.

public class ComparatorDemo2 {

	public static void main(String[] args) {
		ComparatorDemo2 obj=new ComparatorDemo2();
		Set<Question> qset=obj.getQuestionSet();
		
		System.out.println(qset);

	}
	public Set<Question> getQuestionSet(){
//		Set<Question> questionSet=new TreeSet<>(new MyQuestionComparator());
		Set<Question> questionSet=new TreeSet<>((q1,q2)->{return q2.qid.compareTo(q1.qid);});
//		Set<Question> questionSet=new TreeSet<>(new Comparator<Question>() {
//			@Override
//			public int compare(Question o1, Question o2) {
//				// TODO Auto-generated method stub
//				return o1.compareTo(o2);
//			}
//		});
		Question q1=new Question("1", "who is cm", "chiefmember", "chiefminister", "chiefmajor", "2");
		Question q2=new Question("2", "who is pm", "primemember", "primeminister", "primemajor", "2");
		Question q3=new Question("3", "who is dm", "districtmember", "districtmajistrate", "districtmajor", "2");
		Question q4=new Question("4", "who is hm", "headmember", "headmaster", "headmajor", "2");
		Question q5=new Question("5", "who is cm", "chiefmember", "chiefminister", "chiefmajor", "2");
		questionSet.add(q1);
		questionSet.add(q2);
		questionSet.add(q3);
		questionSet.add(q4);
		questionSet.add(q5);
		
		return questionSet;
	}

}

class MyQuestionComparator implements Comparator<Question>{
	@Override
	public int compare(Question o1, Question o2) {
		// TODO Auto-generated method stub
		return o2.compareTo(o1);
	}
}

class Question implements Comparable<Question>{
	String qid,question,option1,option2,option3,answer;
	public Question(String qid, String question, String option1, String option2, String option3, String answer) {
		this.qid = qid;
		this.question = question;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "Question [qid=" + qid + ", question=" + question + ", option1=" + option1 + ", option2=" + option2
				+ ", option3=" + option3 + ", answer=" + answer + "]\n";
	}
	@Override
	public int compareTo(Question o) {
		return this.qid.compareTo(o.qid);
		//return o.qid.compareTo(this.qid);
	}
}