package beanLifeCycle.beanClasses;

public class WorkerInstanceFactory {
/* instance factory method we create when our bean object has parameterized constructor*/
	public WorkerBean getWorker() {
		System.out.println("factory method invoke");
		WorkerBean worker=new WorkerBean(10);
		return worker;
	}
}
