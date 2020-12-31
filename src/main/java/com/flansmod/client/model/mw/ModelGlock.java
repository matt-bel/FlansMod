//This File was created with the Minecraft-SMP Modelling Toolbox 1.5.4.1
// Copyright (C) 2013 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 3.0.x+

// Model Checklist
//    Model: 
//    - Check Left/Right    [ ]  (Left = + / Right = -)
//    - Code Cleaned        [ ]
//    - Coverted to Version [ ]

package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelGlock extends ModelGun
{
	int textureX = 512;
	int textureY = 32;

	public ModelGlock() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[12];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 3
		gunModel[3] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 4
		gunModel[4] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 5
		gunModel[5] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 6
		gunModel[6] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 7
		gunModel[7] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 8
		gunModel[8] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 9
		gunModel[9] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 12
		gunModel[10] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 15
		gunModel[11] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 16

		gunModel[0].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[0].setRotationPoint(0F, -4.5F, -0.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -1F, -0.25F); // Box 1
		gunModel[1].setRotationPoint(3F, -4.5F, -0.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, 0F, 0F, -0.375F, -0.75F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, -0.75F, -0.375F, -0.375F); // Box 3
		gunModel[2].setRotationPoint(3F, -4.5F, -0.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 4
		gunModel[3].setRotationPoint(2F, -3.5F, -0.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 5
		gunModel[4].setRotationPoint(4.5F, -4.5F, -0.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		gunModel[5].setRotationPoint(1F, -5.5F, -0.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Box 7
		gunModel[6].setRotationPoint(0F, -5.5F, -0.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 8
		gunModel[7].setRotationPoint(0F, -5.5F, -0.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 9
		gunModel[8].setRotationPoint(6F, -5.5F, -0.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.075F, -0.2F, 0F, -0.075F, -0.2F, 0F, -0.075F, -0.2F, 0F, -0.075F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 12
		gunModel[9].setRotationPoint(3F, -6F, -0.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 15
		gunModel[10].setRotationPoint(5F, -6F, -0.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.8F, -0.05F, -3.05F, -0.8F, -0.05F, -3.05F, -0.8F, -0.05F, 0F, -0.8F, -0.05F, 0F, 0F, -0.05F, -3.05F, 0F, -0.05F, -3.05F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 16
		gunModel[11].setRotationPoint(6F, -5.5F, -0.5F);


		ammoModel = new ModelRendererTurbo[2];
		ammoModel[0] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 17
		ammoModel[1] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 24

		ammoModel[0].addShapeBox(0F, 0F, 0F, 4, 8, 1, 0F, -2.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -2.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -2.125F, 0F, -0.125F, -2.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Box 17
		ammoModel[0].setRotationPoint(-1F, -4.5F, -0.5F);

		ammoModel[1].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0.5F, 0F, -0.125F, 0.5F, 0F, 0F, 0F, 0F); // Box 24
		ammoModel[1].setRotationPoint(-1F, 2.5F, -0.5F);


		slideModel = new ModelRendererTurbo[10];
		slideModel[0] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 10
		slideModel[1] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 11
		slideModel[2] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 13
		slideModel[3] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 14
		slideModel[4] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 18
		slideModel[5] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 19
		slideModel[6] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 20
		slideModel[7] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 22
		slideModel[8] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 23
		slideModel[9] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 24

		slideModel[0].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		slideModel[0].setRotationPoint(0F, -6F, -0.5F);

		slideModel[1].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		slideModel[1].setRotationPoint(5F, -6F, -0.5F);

		slideModel[2].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		slideModel[2].setRotationPoint(3F, -6F, -0.5F);

		slideModel[3].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 14
		slideModel[3].setRotationPoint(3F, -6F, -0.5F);

		slideModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.8F, -0.4F, -0.5F, -0.8F, -0.4F, -0.5F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 18
		slideModel[4].setRotationPoint(8F, -7F, -0.5F);

		slideModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.9F, -0.3F, -0.875F, -0.9F, -0.3F, -0.875F, -0.9F, -0.3F, 0F, -0.9F, -0.3F, 0F, 0F, -0.3F, -0.75F, 0F, -0.3F, -0.75F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 19
		slideModel[5].setRotationPoint(1F, -7F, -0.5F);

		slideModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.8F, -0.2F, -0.875F, -0.8F, -0.2F, -0.875F, -0.8F, -0.7F, 0F, -0.8F, -0.7F, 0F, 0F, -0.2F, -0.75F, 0F, -0.2F, -0.75F, 0F, -0.7F, 0F, 0F, -0.7F); // Box 20
		slideModel[6].setRotationPoint(1F, -7F, -0.5F);

		slideModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.9F, -0.25F, -0.25F, -0.9F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.9F, -0.25F, -0.25F, -0.9F); // Box 22
		slideModel[7].setRotationPoint(1F, -6F, 0.5F);

		slideModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, -0.9F, -0.75F, -0.375F, -0.9F, -0.75F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, -0.9F, -0.75F, -0.375F, -0.9F); // Box 23
		slideModel[8].setRotationPoint(1F, -6F, 0.5F);

		slideModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.8F, -0.7F, -0.875F, -0.8F, -0.7F, -0.875F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F, 0F, -0.7F, -0.75F, 0F, -0.7F, -0.75F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 24
		slideModel[9].setRotationPoint(1F, -7F, -0.5F);



		barrelAttachPoint = new Vector3f(-7F /16F, 0.75F /16F, 0F /16F);

		animationType = EnumAnimationType.PISTOL_CLIP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}