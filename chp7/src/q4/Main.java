package q4;

import java.util.Objects;

class India{
	int states = 28;
	int uts = 8;
	String largestState = "Rajasthan";
	String smallestState = "Goa";
	@Override
	public String toString() {
		return "India [states=" + states + ", uts=" + uts + ", "
				+ (largestState != null ? "largestState=" + largestState + ", " : "")
				+ (smallestState != null ? "smallestState=" + smallestState : "") + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(largestState, smallestState, states, uts);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		India other = (India) obj;
		return Objects.equals(largestState, other.largestState) && Objects.equals(smallestState, other.smallestState)
				&& states == other.states && uts == other.uts;
	}
}

public class Main {
	public static void main(String[] args) {
		India india1 = new India();
		System.out.println(india1);
		India india2 = new India();
		System.out.println(india1.equals(india2));
	}
}
