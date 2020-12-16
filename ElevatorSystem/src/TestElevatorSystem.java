import com.design.sagar.controller.impl.RequestSchedulerImpl;
import com.design.sagar.data.RequestQueue;
import com.design.sagar.domain.Direction;
import com.design.sagar.domain.Request;
import com.design.sagar.requestor.impl.ExternalButtonImpl;
import com.design.sagar.requestor.impl.InternalButtonImpl;

/**
 * 
 */

/**
 * @author seemasagar
 *
 */
public class TestElevatorSystem {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {

		ExternalButtonImpl external = new ExternalButtonImpl("EXT", "1");
		Request request = new Request(external.getButtonType(), null,  external.getSrcFloor(),null, Direction.UP,
				getPriority(external.getButtonType()));
		external.onPress(request);

		external = new ExternalButtonImpl("EXT", "2");
		request = new Request(external.getButtonType(), null, external.getSrcFloor(),null, Direction.UP,
				getPriority(external.getButtonType()));
		external.onPress(request);

		external = new ExternalButtonImpl("EXT", "3");
		request = new Request(external.getButtonType(), null, external.getSrcFloor(),null, Direction.UP,
				getPriority(external.getButtonType()));
		external.onPress(request);

		external = new ExternalButtonImpl("EXT", "4");
		request = new Request(external.getButtonType(), null, external.getSrcFloor(),null, Direction.UP,
				getPriority(external.getButtonType()));
		external.onPress(request);

		InternalButtonImpl internal = new InternalButtonImpl("INT", "2", "5","1");
		 request = new Request(internal.getButtonType(), internal.getElevatorId(), internal.getSrcFloor(), internal.getDestFloor(), Direction.DOWN,
				 getPriority(internal.getButtonType()));
		external.onPress(request);
		RequestSchedulerImpl scheduler = new RequestSchedulerImpl();
		int i = 1;
		while (i < 10) {
			Thread.sleep(2000);
			if (i % 6 == 0) {
				 internal = new InternalButtonImpl("INT", "4", "2","2");
				 request = new Request(internal.getButtonType(), internal.getElevatorId(), internal.getSrcFloor(), internal.getDestFloor(), Direction.UP,
						getPriority(internal.getButtonType()));
				external.onPress(request);
			}

			if (i == 4) {
				external = new ExternalButtonImpl("EXT", "4");
				request = new Request(external.getButtonType(), null, external.getSrcFloor(),null, Direction.UP,
						getPriority(external.getButtonType()));
				external.onCancellation(request);
			}
			i++;
			System.out.println(" Requests pending in the queue " + RequestQueue.getInstance().size());
			Request queueRequest = RequestQueue.getInstance().peek();
			if (null != request)
				scheduler.assignElevator();

		}

	}

	private static String getPriority(String buttonType) {
		if(buttonType !=null)
			return buttonType.equalsIgnoreCase("INT") ? "HIGH" : "LOW";
		else
			return "P2";
		
	}

}
