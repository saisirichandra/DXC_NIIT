package Serialization;

import java.io.Serializable;

public class Transient implements Serializable{
	transient final int k=240;// var k not serialized bot value 240 serialized
	int j=20;
	transient int i=0;// won't serialize

}
