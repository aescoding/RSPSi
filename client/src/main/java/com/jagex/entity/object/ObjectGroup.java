package com.jagex.entity.object;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.jagex.chunk.Chunk;
import com.jagex.map.object.DefaultWorldObject;

public class ObjectGroup {

	private final int objectId;
	private List<DefaultWorldObject> objects;

	public ObjectGroup(int objectId) {
		objects = new ArrayList<>();
		this.objectId = objectId;
	}

	public void addObject(DefaultWorldObject object) {
		if (objects.contains(object))
			return;
		objects.add(object);

	}

	public int getObjectId() {
		return objectId;
	}

	public List<DefaultWorldObject> getObjects() {
		return objects;
	}

	public void sort(Chunk chunk) {
		
		Collections.sort(objects, (p1, p2) -> p1.getLocHash(chunk) - p2.getLocHash(chunk));

	}

}