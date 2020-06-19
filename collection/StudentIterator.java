package collection;

import java.util.*;
import core.Student;

public interface StudentIterator extends Enumeration{
	
	public boolean hasMoreElements();
	
	public Student nextElement();
}