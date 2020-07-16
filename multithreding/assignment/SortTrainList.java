package com.multithreding.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortTrainList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Train> list = new ArrayList<>();

		Train t1 = new Train(4210, "10:21", "Pune");
		Train t2 = new Train(4211, "10:22", "Lonavala");
		Train t3 = new Train(4212, "10:23", "Lonavala");
		Train t4 = new Train(4211, "10:01", "Pune");
		Train t5 = new Train(4212, "10:29", "Karjat");
		Train t6 = new Train(4214, "12:30", "Karjat");
		Train t7 = new Train(4210, "10:45", "Lonavala");
		Train t8 = new Train(4211, "11:02", "Karjat");
		Train t9 = new Train(4214, "11:05", "Lonavala");
		Train t0 = new Train(4210, "12:45", "Mumbai");
		Train t11 = new Train(4210, "11:50", "Karjat");
		Train t12 = new Train(4214, "12:55", "Mumbai");
		Train t13 = new Train(4211, "12:01", "Mumbai");
		Train t14 = new Train(4212, "11:51", "Mumbai");
		Train t15 = new Train(4212, "09:51", "Pune");

		list.add(t1);
		list.add(t2);
		list.add(t3);
		list.add(t4);
		list.add(t5);
		list.add(t6);
		list.add(t7);
		list.add(t8);
		list.add(t9);
		list.add(t0);
		list.add(t11);
		list.add(t12);
		list.add(t13);
		list.add(t14);
		list.add(t15);

		Collections.sort(list,new sortComparator().thenComparing(new sortComparator1()));
		
		//Collections.sort(list,new sortComparator1());
		
		System.out.println(list.toString());
		
		List<Train> sortedEmployees = list.parallelStream()
				   .sorted(Comparator.comparing(Train::getTrain_Number).thenComparing(Train::getTrain_Timing))
				   .collect(Collectors.toList());
		
		System.out.println(sortedEmployees.toString());
	}
}

class sortComparator implements Comparator<Train>{

	@Override
	public int compare(Train o1, Train o2) {
		// TODO Auto-generated method stub
		return o1.Train_Number - o2.Train_Number;
	}
}

class sortComparator1 implements Comparator<Train>{

	@Override
	public int compare(Train o1, Train o2) {
		// TODO Auto-generated method stub
		return o1.Train_Timing.compareTo(o2.Train_Timing);
	}
	
}

class Train {
	int Train_Number;
	String Train_Timing;
	String Station_Name;

	public Train(int train_Number, String train_Timing, String station_Name) {
		super();
		Train_Number = train_Number;
		Train_Timing = train_Timing;
		Station_Name = station_Name;
	}

	public int getTrain_Number() {
		return Train_Number;
	}

	public void setTrain_Number(int train_Number) {
		Train_Number = train_Number;
	}

	public String getTrain_Timing() {
		return Train_Timing;
	}

	public void setTrain_Timing(String train_Timing) {
		Train_Timing = train_Timing;
	}

	public String getStation_Name() {
		return Station_Name;
	}

	public void setStation_Name(String station_Name) {
		Station_Name = station_Name;
	}

	@Override
	public String toString() {
		return "Train [" + Train_Number + "|" + Train_Timing + "|" + Station_Name + "]" + "\n";
	}
}
