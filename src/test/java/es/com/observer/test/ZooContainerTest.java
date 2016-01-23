/**
 *
 */
package es.com.observer.test;

import org.junit.Test;

import com.santy.observer.pattern.domain.Animal;
import com.santy.observer.pattern.domain.ZooContainer;

/**
 * @author santy
 *
 */
public class ZooContainerTest
{

	@Test
	public void zooContainerInvocationTest() throws Exception
	{

		ZooContainer zooContainer = new ZooContainer();
		zooContainer.getZoo().addAnimal(new Animal("Tiger"));
	}
}
