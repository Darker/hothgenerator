package biz.orgin.minecraft.hothgenerator.schematic;

import biz.orgin.minecraft.hothgenerator.HothUtils;

public class Decor6 implements Schematic
{
	public static Schematic instance = new Decor6();
	private static int WIDTH = 3;
	private static int LENGTH = 3;
	private static int HEIGHT = 3;
	private static String name = "Decor6";
	
	private final int[][][] matrix = new int[][][]
	{
		    //   TYPEID                       DATAID
		{   // Layer 0
			{ 44, 44, 44,   0, 0, 0},
			{ 44, 89, 44,   0, 0, 0},
			{ 44, 44, 44,   0, 0, 0}
		},
		{   // Layer 1
			{ 43, 54, 43,   0, 0, 0},
			{ 54, 98, 54,   2, 0, 3},
			{ 43, 54, 43,   0, 1, 0}
		},
		{   // Layer 2
			{ 43, 43, 43,   0, 0, 0},
			{ 43, 98, 43,   0, 0, 0},
			{ 43, 43, 43,   0, 0, 0}
		}
	};
	
	private Decor6()
	{
	}
	
	public int getWidth() // Inner
	{
		return Decor6.WIDTH;
	}
	public int getLength() // Middle
	{
		return Decor6.LENGTH;
	}
	public int getHeight() // Outer
	{
		return Decor6.HEIGHT;
	}
	
	public int[][][] getMatrix()
	{
		return this.matrix;
	}

	@Override
	public String getName()
	{
		return Decor6.name;
	}

	@Override
	public Schematic rotate(int direction)
	{
		return HothUtils.rotateSchematic(direction, this);
	}
}