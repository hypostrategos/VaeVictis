package com.controller;

import java.util.ArrayList;
import java.util.List;

import com.model.creature.Creature;
import com.model.creature.body.Part;

public class Combat {
	
	public static void combStart(Creature att, Creature def) {
		System.out.println("Combat between "+att+" vs "+def);
		List<Part> targs = new ArrayList<>(def.frame.torsoSegments);
		targs.add(def.frame.head);
		
		targs.stream().forEach(x->System.out.println(x));
//				Stream.concat(def.frame.torsoSegments.stream(), def.frame.head)
//        .collect(Collectors.toList());
	}

}
