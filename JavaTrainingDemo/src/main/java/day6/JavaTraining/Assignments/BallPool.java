package day6.JavaTraining.Assignments;

import java.util.HashMap;
import java.util.Map.Entry;

public class BallPool extends Ball{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Ball ball = new Ball();
		int[] ballPool = createBallPool(BallState.heavy);
		HashMap<String,int[]> firstWeightResult = new HashMap<String,int[]>();
		
		for(int i=0;i<ballPool.length;i++) {
			System.out.println("Ball"+(i+1)+": "+ballPool[i]);
		}
		
		firstWeightResult=firstWeight(ballPool);
		int[] ballPool2 = new int[8];
		int counter = 0;
		for(String key : firstWeightResult.keySet()) {
			int[] groupVal = firstWeightResult.get(key);
			for(int i=0;i<groupVal.length;i++) {
				ballPool2[counter]=groupVal[i];
				counter++;
			}
		}
		
		
		System.out.println("");
//		secondWeight();
		
	}
	
	public static void secondWeight() {
		
	}
	
	public static HashMap<String, int[]> firstWeight(int[] balls) {
		HashMap<String, int[]> result = new HashMap<String, int[]>();
		HashMap<Integer, int[]> groupList = getFirstWeightGroup(balls);
		
		result = calculateFirstWeight(groupList);
		
		return result;
	}
	
	private static HashMap<Integer, int[]> getFirstWeightGroup(int[] balls){
		int groups = 3, counter = 0;
		HashMap<Integer,int[]> groupList = new HashMap<Integer, int[]>();
		
		for(int i=0;i<groups;i++) {
			int[] group = new int[4];
			for(int j=0;j<group.length;j++) {
				group[j] = balls[counter];
				counter++;
			}
			groupList.put(i, group);
		}
		
		return groupList;
	}
	
	public static HashMap<String, int[]> calculateFirstWeight(HashMap<Integer,int[]> groupList) {
		HashMap<String, int[]> groupResult = new HashMap<String, int[]>();
		String compareResult = "";
		int groupSize = groupList.size();
		int[] groups = new int[groupSize];
		for(int i=0;i<groupSize;i++) {
			groups[i]=calculate(groupList.get(i));
		}
		
		//Get the group with odd ball
//		int oddGroup = getOddGroup(groups);
//		System.out.println("Odd group: "+oddGroup);
		weigh(groups[0],groups[1]);
		compareResult = Scale.getCompareResult();
		
		if(compareResult.equals(Scale.compareEqual)) {
			groupResult.put("Group2", groupList.get(1));
			groupResult.put("Group3", groupList.get(2));
		}else if(compareResult.equals(Scale.compareLeft) || compareResult.equals(Scale.compareRight)) {
			groupResult.put("Group1", groupList.get(1));
			groupResult.put("Group2", groupList.get(2));
		}
		
		return groupResult;
	}
	
	//Calculate Odd Group
//	private static int getOddGroup(int[] oddGroup) {
//		HashMap<Integer, Boolean> groupResult = new HashMap<Integer, Boolean>();
//		int group=1;
//		for(int i=0;i<oddGroup.length;i++) {
//			if(oddGroup[i]<0 || oddGroup[i]>0) {
//				group=(i+1);
//			}else {
//				
//			}
//		}
//		return group;
//	}
	
	private static int calculate(int[] group) {
		int value=0;
		
		for(int i=0;i<group.length;i++) {
			value=value+group[i];
		}
		return value;
	}
	
	private static void weigh(int left, int right) {
		Scale.readyCompare();
		if(left == right) {
			Scale.setIsEqual(true);
		}else if(left > right) {
			Scale.setIsLeft(true);
		}else if(left < right) {
			Scale.setIsRight(true);
		}
	}

}