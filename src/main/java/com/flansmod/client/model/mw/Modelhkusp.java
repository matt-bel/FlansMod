//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: HK USP
// Model Creator: 
// Created on: 11.06.2019 - 00:44:14
// Last changed on: 11.06.2019 - 00:44:14

package com.flansmod.client.model.mw; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class Modelhkusp extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 32;

	public Modelhkusp() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[14];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 5
		gunModel[5] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 6
		gunModel[6] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 7
		gunModel[7] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 10
		gunModel[8] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 23
		gunModel[9] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 32
		gunModel[10] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 40
		gunModel[11] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 47
		gunModel[12] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 56
		gunModel[13] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 57

		gunModel[0].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[0].setRotationPoint(0F, -4.55F, -0.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.5F, 0F, 0.65F, -0.5F, 0F, 0.65F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.65F, 0F, 0F, 0.65F, 0F, 0F, 0F, 0F, 0F); // Box 1
		gunModel[1].setRotationPoint(1F, -5.55F, -0.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F); // Box 2
		gunModel[2].setRotationPoint(0F, -5.55F, -0.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 3
		gunModel[3].setRotationPoint(3F, -6.05F, -0.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.2F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, -0.75F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.2F, -0.75F, -0.25F); // Box 5
		gunModel[4].setRotationPoint(3F, -4.55F, -0.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, -1F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 6
		gunModel[5].setRotationPoint(4F, -4.55F, -0.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, 0F, 0.25F, -0.25F); // Box 7
		gunModel[6].setRotationPoint(2F, -4.3F, -0.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.6F, -0.2F); // Box 10
		gunModel[7].setRotationPoint(3F, -6.05F, -0.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.25F, -0.25F, -0.8F, -0.25F, -0.25F, -0.8F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.8F, -0.25F, -0.25F, -0.8F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 23
		gunModel[8].setRotationPoint(6F, -6.05F, -0.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 32
		gunModel[9].setRotationPoint(0F, -0.55F, -0.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.9F, -0.2F, 0F, -0.9F, -0.2F, 0F, -0.9F, -0.2F, 0F, -0.9F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 40
		gunModel[10].setRotationPoint(3F, -7.05F, -0.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 47
		gunModel[11].setRotationPoint(5F, -5.55F, -0.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.35F, -0.5F, 0F, -0.35F, -0.5F, 0F, -0.35F, 0F, 0F, -0.35F, -0.5F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.5F, 0F, -0.35F); // Box 56
		gunModel[12].setRotationPoint(0F, -6.05F, -0.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, -0.05F, -3.05F, 0F, -0.05F, -3.05F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.8F, -0.05F, -3.05F, -0.8F, -0.05F, -3.05F, -0.8F, -0.05F, 0F, -0.8F, -0.05F); // Box 57
		gunModel[13].setRotationPoint(5.65F, -4.75F, -0.5F);


		ammoModel = new ModelRendererTurbo[3];
		ammoModel[0] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 30
		ammoModel[1] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 33
		ammoModel[2] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 34

		ammoModel[0].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -1.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -0.2F, 0F, -0.125F); // Box 30
		ammoModel[0].setRotationPoint(0F, -4.55F, -0.5F);

		ammoModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.8F, -0.8F, 0F); // Box 33
		ammoModel[1].setRotationPoint(1F, -0.55F, -0.5F);

		ammoModel[2].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F); // Box 34
		ammoModel[2].setRotationPoint(0F, -0.55F, -0.5F);


		slideModel = new ModelRendererTurbo[24];
		slideModel[0] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 4
		slideModel[1] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 9
		slideModel[2] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 11
		slideModel[3] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 12
		slideModel[4] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 13
		slideModel[5] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 14
		slideModel[6] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 15
		slideModel[7] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 16
		slideModel[8] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 17
		slideModel[9] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 18
		slideModel[10] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 39
		slideModel[11] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 56
		slideModel[12] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 54
		slideModel[13] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 55
		slideModel[14] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 59
		slideModel[15] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 61
		slideModel[16] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 64
		slideModel[17] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 71
		slideModel[18] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 72
		slideModel[19] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 73
		slideModel[20] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 74
		slideModel[21] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 40
		slideModel[22] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 41
		slideModel[23] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 67

		slideModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		slideModel[0].setRotationPoint(1F, -6.05F, -0.5F);

		slideModel[1].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 9
		slideModel[1].setRotationPoint(5F, -6.05F, -0.5F);

		slideModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 11
		slideModel[2].setRotationPoint(2F, -6.05F, -0.5F);

		slideModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		slideModel[3].setRotationPoint(2F, -6.05F, -0.5F);

		slideModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 13
		slideModel[4].setRotationPoint(2F, -6.05F, -0.5F);

		slideModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.4F, -0.8F, -0.2F, -1F, -0.8F, -0.2F, -1F, -0.8F, -0.2F, 0.4F, -0.8F, -0.2F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Box 14
		slideModel[5].setRotationPoint(1F, -7.05F, -0.5F);

		slideModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		slideModel[6].setRotationPoint(3F, -6.05F, -0.5F);

		slideModel[7].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		slideModel[7].setRotationPoint(5F, -7.05F, -0.5F);

		slideModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.8F, 0F, -0.75F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 17
		slideModel[8].setRotationPoint(3F, -6.05F, -0.5F);

		slideModel[9].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.8F, 0F, -0.25F, -0.8F); // Box 18
		slideModel[9].setRotationPoint(2F, -6.05F, -0.5F);

		slideModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, 0.075F, 0F, -0.25F, 0.075F, 0F, -0.25F, -0.825F, 0F, -0.25F, -0.825F, 0F, -0.5F, 0.075F, 0F, -0.5F, 0.075F, 0F, -0.5F, -0.825F, 0F, -0.5F, -0.825F); // Box 39
		slideModel[10].setRotationPoint(2F, -6.05F, -0.5F);

		slideModel[11].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, -0.8F, 0F, -0.375F, -0.8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F); // Box 56
		slideModel[11].setRotationPoint(3F, -6.05F, -0.5F);

		slideModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -0.5F, 0F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, 0F, 0F, -0.65F); // Box 54
		slideModel[12].setRotationPoint(0F, -6.05F, -0.5F);

		slideModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		slideModel[13].setRotationPoint(0F, -6.05F, -0.5F);

		slideModel[14].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		slideModel[14].setRotationPoint(1F, -7.05F, -0.5F);

		slideModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.6F, -0.7F, -0.75F, -0.6F, -0.7F, -0.75F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.3F, -0.7F, -0.75F, -0.3F, -0.7F, -0.75F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 61
		slideModel[15].setRotationPoint(1F, -7.05F, -0.5F);

		slideModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.6F, -0.8F, -0.75F, -0.6F, -0.8F, -0.75F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.2F, -0.8F, -0.75F, -0.2F, -0.8F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 64
		slideModel[16].setRotationPoint(1F, -7.05F, -0.5F);

		slideModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.6F, -0.2F, -0.75F, -0.6F, -0.2F, -0.75F, -0.6F, -0.7F, 0F, -0.6F, -0.7F, 0F, -0.3F, -0.2F, -0.75F, -0.3F, -0.2F, -0.75F, -0.3F, -0.7F, 0F, -0.3F, -0.7F); // Box 71
		slideModel[17].setRotationPoint(1F, -7.05F, -0.5F);

		slideModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.6F, 0F, -0.75F, -0.6F, 0F, -0.7F, -0.8F, -0.75F, -0.25F, -0.6F, -0.75F, -0.25F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, -0.2F, -0.75F, -0.25F, -0.2F, -0.75F); // Box 72
		slideModel[18].setRotationPoint(1F, -7.05F, -0.5F);

		slideModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.6F, 0F, -0.75F, -0.6F, 0F, -0.75F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.2F, -0.8F, 0F, -0.2F, -0.8F); // Box 73
		slideModel[19].setRotationPoint(1F, -7.05F, -0.5F);

		slideModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.6F, -0.4F, -0.2F, -0.6F, -0.4F, -0.2F, -0.6F, -0.4F, -0.5F, -0.6F, -0.4F, -0.5F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, -0.5F, -0.2F, -0.4F); // Box 74
		slideModel[20].setRotationPoint(7.75F, -7.05F, -0.5F);

		slideModel[21].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.8F, 0F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F); // Box 40
		slideModel[21].setRotationPoint(5F, -6.05F, -0.5F);

		slideModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.6F, -0.75F, -0.7F, -0.8F, -0.75F, -0.75F, -0.6F, 0F, -0.25F, -0.6F, 0F, -0.25F, -0.2F, -0.8F, -0.7F, -0.2F, -0.8F, -0.7F, 0F, 0F, -0.25F, 0F, 0F); // Box 41
		slideModel[22].setRotationPoint(1F, -7.05F, -0.5F);

		slideModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.7F, -0.2F, -0.75F, -0.7F, -0.2F, -0.75F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.2F, -0.2F, -0.75F, -0.2F, -0.2F, -0.75F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 67
		slideModel[23].setRotationPoint(1F, -7.05F, -0.5F);



		barrelAttachPoint = new Vector3f(-7F /16F, 0.6F /16F, 0F /16F);

		gunSlideDistance = 0.2F;


		animationType = EnumAnimationType.PISTOL_CLIP;


		pumpTime = 0;


		revolverFlipAngle = 0F;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}