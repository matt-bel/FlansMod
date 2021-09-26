//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Desert Eagle Midas
// Model Creator: 
// Created on: 15.06.2019 - 23:14:40
// Last changed on: 15.06.2019 - 23:14:40

package com.flansmod.client.model.mw; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelGoldDesertEagle extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 32;

	public ModelGoldDesertEagle() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[34];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 4
		gunModel[5] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 17
		gunModel[6] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 20
		gunModel[7] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 21
		gunModel[8] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 24
		gunModel[9] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 25
		gunModel[10] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 26
		gunModel[11] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 27
		gunModel[12] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 28
		gunModel[13] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 29
		gunModel[14] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 30
		gunModel[15] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 31
		gunModel[16] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 32
		gunModel[17] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 41
		gunModel[18] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 42
		gunModel[19] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 43
		gunModel[20] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 51
		gunModel[21] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 52
		gunModel[22] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 53
		gunModel[23] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 54
		gunModel[24] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 55
		gunModel[25] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 57
		gunModel[26] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 58
		gunModel[27] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 59
		gunModel[28] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 60
		gunModel[29] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 64
		gunModel[30] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 65
		gunModel[31] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 68
		gunModel[32] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 69
		gunModel[33] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 71

		gunModel[0].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[0].setRotationPoint(0F, -3.5F, -0.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -1F, -0.25F); // Box 1
		gunModel[1].setRotationPoint(3F, -3.5F, -0.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 2
		gunModel[2].setRotationPoint(2F, -2.5F, -0.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 3
		gunModel[3].setRotationPoint(4F, -3.5F, -0.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		gunModel[4].setRotationPoint(1F, -4.5F, -0.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		gunModel[5].setRotationPoint(5F, -5.25F, -0.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.8F, 0F, -0.25F, -0.8F); // Box 20
		gunModel[6].setRotationPoint(10F, -4.25F, 0.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 21
		gunModel[7].setRotationPoint(10F, -5.25F, 0.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		gunModel[8].setRotationPoint(10F, -5.25F, -1.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.8F, 0F, -0.25F, -0.8F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 25
		gunModel[9].setRotationPoint(10F, -4.25F, -1.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 26
		gunModel[10].setRotationPoint(11F, -5.5F, -0.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F); // Box 27
		gunModel[11].setRotationPoint(11F, -4.5F, -0.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		gunModel[12].setRotationPoint(11F, -5.25F, -1.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.8F, -1F, -0.25F, -0.8F, -1F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 29
		gunModel[13].setRotationPoint(11F, -4.25F, -1.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, -0.8F, 0F, -0.25F, -0.8F); // Box 30
		gunModel[14].setRotationPoint(11F, -4.25F, 0.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 31
		gunModel[15].setRotationPoint(11F, -5.25F, 0.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.125F, -0.125F, 0.1F, -0.125F, -0.125F, 0.1F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0.1F, -0.125F, -0.125F, 0.1F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 32
		gunModel[16].setRotationPoint(11F, -5.5F, -0.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.8F, -0.1F, 0F, -0.8F, -0.1F, 0F, -0.8F, -0.1F, 0F, -0.8F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		gunModel[17].setRotationPoint(5F, -6.5F, -0.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, -0.85F, -0.15F, -4F, -0.85F, -0.15F, -4F, -0.85F, -0.15F, 0F, -0.85F, -0.15F, 0F, 0F, -0.15F, -4F, 0F, -0.15F, -4F, 0F, -0.15F, 0F, 0F, -0.15F); // Box 42
		gunModel[18].setRotationPoint(7F, -6.5F, -0.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		gunModel[19].setRotationPoint(11F, -6.5F, -0.5F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, -0.25F, 1F, -0.75F, -0.25F, 1F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 1F, -0.25F, -0.25F, 1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 51
		gunModel[20].setRotationPoint(0F, -5.25F, -0.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 52
		gunModel[21].setRotationPoint(0F, -5.25F, -0.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, -0.35F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.35F, -0.25F, 0F); // Box 53
		gunModel[22].setRotationPoint(0F, -4.5F, -0.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, 0F, -0.9F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.9F, -0.5F, 0F); // Box 54
		gunModel[23].setRotationPoint(0F, -3.5F, -0.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.35F, -0.75F, 0F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, 0F); // Box 55
		gunModel[24].setRotationPoint(0F, -4.5F, -0.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0F, 0F, -0.05F, -6.05F, 0F, -0.05F, -6.05F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.8F, -0.05F, -6.05F, -0.8F, -0.05F, -6.05F, -0.8F, -0.05F, 0F, -0.8F, -0.05F); // Box 57
		gunModel[25].setRotationPoint(5F, -3.5F, -0.5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 58
		gunModel[26].setRotationPoint(7F, -5.5F, -0.5F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		gunModel[27].setRotationPoint(7F, -5.25F, -0.5F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.2F, 0F, -0.75F, -0.2F, 0F, -0.75F, -0.2F, 0F, -0.75F, -0.2F); // Box 60
		gunModel[28].setRotationPoint(11F, -5.5F, -0.5F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -1F, -0.425F, -0.5F, -0.75F, -0.425F, -0.5F, -0.75F, -0.425F, 0F, -1F, -0.425F, 0F, 0F, -0.425F, -0.5F, 0F, -0.425F, -0.5F, 0F, -0.425F, 0F, 0F, -0.425F); // Box 64
		gunModel[29].setRotationPoint(11.25F, -6.7F, -0.5F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.9F, 0.25F, -0.5F, -0.9F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 65
		gunModel[30].setRotationPoint(0F, 0.5F, -0.5F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, -0.9F, 0F, -0.5F, -0.9F); // Box 68
		gunModel[31].setRotationPoint(0F, 0.5F, -0.5F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.1F, -0.9F, 0F, -0.1F, -0.9F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, -0.9F, -0.5F, -0.1F, -0.9F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 69
		gunModel[32].setRotationPoint(0F, 0.5F, -0.5F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.9F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.9F, 0F, -0.1F, -1.15F, -0.5F, -0.1F, 0.25F, -0.5F, -0.1F, 0.25F, -0.5F, -0.1F, -1.15F, -0.5F, -0.1F); // Box 71
		gunModel[33].setRotationPoint(1F, 0.5F, -0.5F);


		ammoModel = new ModelRendererTurbo[2];
		ammoModel[0] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 66
		ammoModel[1] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 72

		ammoModel[0].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -1.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -1.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -1.1F, 0F, -0.1F, -1.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 66
		ammoModel[0].setRotationPoint(0F, -3.5F, -0.5F);

		ammoModel[1].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.5F, -0.1F, 0.15F, -0.5F, -0.1F, 0.15F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F); // Box 72
		ammoModel[1].setRotationPoint(0F, 0.5F, -0.5F);


		slideModel = new ModelRendererTurbo[15];
		slideModel[0] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 12
		slideModel[1] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 16
		slideModel[2] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 22
		slideModel[3] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 23
		slideModel[4] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 34
		slideModel[5] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 36
		slideModel[6] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 39
		slideModel[7] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 46
		slideModel[8] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 47
		slideModel[9] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 56
		slideModel[10] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 61
		slideModel[11] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 62
		slideModel[12] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 63
		slideModel[13] = new ModelRendererTurbo(this, 72, 13, textureX, textureY); // Box 49
		slideModel[14] = new ModelRendererTurbo(this, 72, 13, textureX, textureY); // Box 50

		slideModel[0].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		slideModel[0].setRotationPoint(2F, -5.25F, -0.5F);

		slideModel[1].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.8F, 0F, -0.25F, -0.8F); // Box 16
		slideModel[1].setRotationPoint(1F, -4.25F, 0.5F);

		slideModel[2].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		slideModel[2].setRotationPoint(5F, -5.25F, -1.5F);

		slideModel[3].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.8F, 0F, -0.25F, -0.8F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 23
		slideModel[3].setRotationPoint(1F, -4.25F, -1.5F);

		slideModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 34
		slideModel[4].setRotationPoint(2F, -6.5F, -0.5F);

		slideModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 36
		slideModel[5].setRotationPoint(4F, -6.5F, -0.5F);

		slideModel[6].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 39
		slideModel[6].setRotationPoint(5F, -5.25F, 0.5F);

		slideModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.25F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.25F, 0F, 0.2F); // Box 46
		slideModel[7].setRotationPoint(1F, -6.5F, -0.5F);

		slideModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.25F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, -0.8F, -0.25F, -0.75F, -0.8F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 47
		slideModel[8].setRotationPoint(1F, -6.25F, 0.5F);

		slideModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.25F, -0.75F, -0.8F, 0F, -0.75F, -0.8F, 0F, -0.75F, 0.25F, -0.25F, -0.75F, 0.25F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 56
		slideModel[9].setRotationPoint(1F, -6.25F, -1.5F);

		slideModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 61
		slideModel[10].setRotationPoint(2F, -6.7F, -0.5F);

		slideModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 62
		slideModel[11].setRotationPoint(2F, -6.7F, -0.5F);

		slideModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.85F, -0.25F, -0.5F, -0.85F, -0.25F, -0.5F, -0.85F, -0.25F, 0F, -0.85F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 63
		slideModel[12].setRotationPoint(2F, -6.7F, -0.5F);

		slideModel[13].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.8F, 0F, 0.25F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 49
		slideModel[13].setRotationPoint(2F, -5.25F, 0.5F);

		slideModel[14].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0.25F, -0.8F, 0F, 0.25F, -0.8F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		slideModel[14].setRotationPoint(2F, -5.25F, -1.5F);



		scopeAttachPoint = new Vector3f(7F /16F, 0F /16F, 0F /16F);

		animationType = EnumAnimationType.PISTOL_CLIP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}