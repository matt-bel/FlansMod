//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: M4
// Model Creator: 
// Created on: 21.07.2019 - 15:43:55
// Last changed on: 21.07.2019 - 15:43:55

package com.flansmod.client.model.zombie; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelM4Carbine extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 32;

	public ModelM4Carbine() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[33];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportBox0
		gunModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Import ImportBox1
		gunModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import ImportBox2
		gunModel[3] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import ImportBox3
		gunModel[4] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import ImportBox4
		gunModel[5] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import ImportBox5
		gunModel[6] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import ImportBox6
		gunModel[7] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Import ImportBox7
		gunModel[8] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Import ImportBox10
		gunModel[9] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Import ImportBox11
		gunModel[10] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Import ImportBox12
		gunModel[11] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Import ImportBox13
		gunModel[12] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Import ImportBox14
		gunModel[13] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Import ImportBox16
		gunModel[14] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Import ImportBox17
		gunModel[15] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Import ImportBox19
		gunModel[16] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Import ImportBox25
		gunModel[17] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Import ImportBox26
		gunModel[18] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Import ImportBox27
		gunModel[19] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Import ImportBox28
		gunModel[20] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Import ImportBox40
		gunModel[21] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Import ImportBox42
		gunModel[22] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Import ImportBox43
		gunModel[23] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Import ImportBox45
		gunModel[24] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Import ImportBox46
		gunModel[25] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Import ImportBox47
		gunModel[26] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Import ImportBox48
		gunModel[27] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Import ImportBox49
		gunModel[28] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Import ImportBox51
		gunModel[29] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Import ImportBox53
		gunModel[30] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Import ImportBox61
		gunModel[31] = new ModelRendererTurbo(this, 10, 1, textureX, textureY); // Import ImportBox53
		gunModel[32] = new ModelRendererTurbo(this, 10, 1, textureX, textureY); // Import ImportBox54

		gunModel[0].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[0].setRotationPoint(0F, -3.5F, -0.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Import ImportBox1
		gunModel[1].setRotationPoint(0F, -4.5F, -0.5F);

		gunModel[2].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import ImportBox2
		gunModel[2].setRotationPoint(0F, -5.5F, -0.5F);

		gunModel[3].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Import ImportBox3
		gunModel[3].setRotationPoint(1F, -4.5F, -0.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1F, -0.25F); // Import ImportBox4
		gunModel[4].setRotationPoint(3F, -3.5F, -0.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Import ImportBox5
		gunModel[5].setRotationPoint(2F, -2.5F, -0.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -0.5F, -0.875F, 0F, -0.5F, -0.875F, 0F, 0F, -0.375F, 0F); // Import ImportBox6
		gunModel[6].setRotationPoint(5F, -3.5F, -0.5F);

		gunModel[7].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Import ImportBox7
		gunModel[7].setRotationPoint(1F, -5.5F, -0.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -0.05F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.05F, -0.125F, -0.125F, -0.05F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.05F, -0.125F, -0.125F); // Import ImportBox10
		gunModel[8].setRotationPoint(-5F, -5.5F, -0.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox11
		gunModel[9].setRotationPoint(5F, -5.5F, -0.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F); // Import ImportBox12
		gunModel[10].setRotationPoint(5F, -5.5F, -0.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.25F, -0.8F, 0F, -0.25F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox13
		gunModel[11].setRotationPoint(3F, -5.3F, -1.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -0.8F, 0F, -0.25F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox14
		gunModel[12].setRotationPoint(3F, -5.3F, -1.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox16
		gunModel[13].setRotationPoint(7F, -5.5F, -0.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, -0.25F, -0.3F, 0F, -0.25F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.3F, 0F, -0.5F, -0.8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox17
		gunModel[14].setRotationPoint(1F, -5.3F, -1.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, -0.5F, -0.3F, 0F, -0.5F, -0.8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.25F, -0.3F, 0F, -0.25F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox19
		gunModel[15].setRotationPoint(1F, -5.3F, -1.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox25
		gunModel[16].setRotationPoint(5F, -4.5F, -0.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.25F, -0.8F, 0F, -0.25F, -0.8F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.8F, 0F, -0.5F, -0.8F); // Import ImportBox26
		gunModel[17].setRotationPoint(1F, -5.3F, 0.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.25F, -0.8F, 0F, -0.25F, -0.8F); // Import ImportBox27
		gunModel[18].setRotationPoint(1F, -5.3F, 0.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Import ImportBox28
		gunModel[19].setRotationPoint(7F, -5.25F, -0.5F);

		gunModel[20].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Import ImportBox40
		gunModel[20].setRotationPoint(7.5F, -5.25F, -0.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Import ImportBox42
		gunModel[21].setRotationPoint(7.5F, -5.25F, 0.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox43
		gunModel[22].setRotationPoint(7.5F, -6.25F, -0.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Import ImportBox45
		gunModel[23].setRotationPoint(7.5F, -5.25F, -1.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Import ImportBox46
		gunModel[24].setRotationPoint(7.5F, -4.25F, -0.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0F, -0.8F, -0.05F, -6F, -0.8F, -0.05F, -6F, -0.8F, -0.05F, 0F, -0.8F, -0.05F, 0F, 0F, -0.05F, -6F, 0F, -0.05F, -6F, 0F, -0.05F, 0F, 0F, -0.05F); // Import ImportBox47
		gunModel[25].setRotationPoint(1F, -6.5F, -0.5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, -0.05F, -0.8F, -0.05F, -5.05F, -0.8F, -0.05F, -5.05F, -0.8F, -0.05F, -0.05F, -0.8F, -0.05F, -0.05F, 0F, -0.05F, -5.05F, 0F, -0.05F, -5.05F, 0F, -0.05F, -0.05F, 0F, -0.05F); // Import ImportBox48
		gunModel[26].setRotationPoint(7.5F, -6.5F, -0.5F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, -0.05F, -0.8F, -0.05F, -5.05F, -0.8F, -0.05F, -5.05F, -0.8F, -0.05F, -0.05F, -0.8F, -0.05F, -0.05F, 0F, -0.05F, -5.05F, 0F, -0.05F, -5.05F, 0F, -0.05F, -0.05F, 0F, -0.05F); // Import ImportBox49
		gunModel[27].setRotationPoint(7.5F, -4.8F, -0.5F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, -0.05F, -0.05F, 0F, -5.05F, -0.05F, 0F, -5.05F, -0.05F, -0.8F, -0.05F, -0.05F, -0.8F, -0.05F, -0.05F, 0F, -5.05F, -0.05F, 0F, -5.05F, -0.05F, -0.8F, -0.05F, -0.05F, -0.8F); // Import ImportBox51
		gunModel[28].setRotationPoint(7.5F, -5.25F, 0.75F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, -0.05F, -0.05F, -0.8F, -5.05F, -0.05F, -0.8F, -5.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, -0.8F, -5.05F, -0.05F, -0.8F, -5.05F, -0.05F, 0F, -0.05F, -0.05F, 0F); // Import ImportBox53
		gunModel[29].setRotationPoint(7.5F, -5.25F, -1.75F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Import ImportBox61
		gunModel[30].setRotationPoint(5F, -4.5F, -1.5F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.75F, 0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.25F); // Import ImportBox53
		gunModel[31].setRotationPoint(0F, -6.5F, -0.5F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, 0.25F, -0.5F, -0.75F, 0.25F, -0.5F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F); // Import ImportBox54
		gunModel[32].setRotationPoint(0F, -6.5F, -0.5F);


		defaultScopeModel = new ModelRendererTurbo[9];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Import ImportBox64
		defaultScopeModel[1] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Import ImportBox65
		defaultScopeModel[2] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Import ImportBox66
		defaultScopeModel[3] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Import ImportBox67
		defaultScopeModel[4] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Import ImportBox68
		defaultScopeModel[5] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Import ImportBox69
		defaultScopeModel[6] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Import ImportBox70
		defaultScopeModel[7] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Import ImportBox71
		defaultScopeModel[8] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Import ImportBox72

		defaultScopeModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox64
		defaultScopeModel[0].setRotationPoint(2F, -6.5F, -0.5F);

		defaultScopeModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -1F, -0.45F, -0.7F, -1F, -0.45F, -0.7F, -1F, -0.45F, -0.2F, -1F, -0.45F, -0.2F, 0.25F, -0.45F, -0.7F, 0.25F, -0.45F, -0.7F, 0.25F, -0.45F, -0.2F, 0.25F, -0.45F); // Import ImportBox65
		defaultScopeModel[1].setRotationPoint(11F, -7.5F, -0.5F);

		defaultScopeModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox66
		defaultScopeModel[2].setRotationPoint(11F, -6.5F, -0.5F);

		defaultScopeModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.95F, -0.675F, -0.5F, -0.95F, -0.675F, -0.5F, -0.95F, -0.25F, 0F, -0.95F, -0.25F, 0F, 0.25F, -0.675F, -0.5F, 0.25F, -0.675F, -0.5F, 0.25F, -0.25F, 0F, 0.25F, -0.25F); // Import ImportBox67
		defaultScopeModel[3].setRotationPoint(11F, -7.5F, -0.5F);

		defaultScopeModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.95F, -0.25F, -0.5F, -0.95F, -0.25F, -0.5F, -0.95F, -0.675F, 0F, -0.95F, -0.675F, 0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.675F, 0F, 0.25F, -0.675F); // Import ImportBox68
		defaultScopeModel[4].setRotationPoint(11F, -7.5F, -0.5F);

		defaultScopeModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Import ImportBox69
		defaultScopeModel[5].setRotationPoint(11F, -6.5F, -0.5F);

		defaultScopeModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Import ImportBox70
		defaultScopeModel[6].setRotationPoint(2F, -6.5F, -0.5F);

		defaultScopeModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.95F, -0.25F, -0.5F, -0.95F, -0.25F, -0.5F, -0.95F, -0.675F, 0F, -0.95F, -0.675F, 0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.675F, 0F, 0.25F, -0.675F); // Import ImportBox71
		defaultScopeModel[7].setRotationPoint(2F, -7.5F, -0.5F);

		defaultScopeModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.95F, -0.675F, -0.5F, -0.95F, -0.675F, -0.5F, -0.95F, -0.25F, 0F, -0.95F, -0.25F, 0F, 0.25F, -0.675F, -0.5F, 0.25F, -0.675F, -0.5F, 0.25F, -0.25F, 0F, 0.25F, -0.25F); // Import ImportBox72
		defaultScopeModel[8].setRotationPoint(2F, -7.5F, -0.5F);


		defaultStockModel = new ModelRendererTurbo[10];
		defaultStockModel[0] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Import ImportBox54
		defaultStockModel[1] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Import ImportBox55
		defaultStockModel[2] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Import ImportBox56
		defaultStockModel[3] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Import ImportBox57
		defaultStockModel[4] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Import ImportBox58
		defaultStockModel[5] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Import ImportBox59
		defaultStockModel[6] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Import ImportBox49
		defaultStockModel[7] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Import ImportBox50
		defaultStockModel[8] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Import ImportBox51
		defaultStockModel[9] = new ModelRendererTurbo(this, 0, 12, textureX, textureY); // Import ImportBox52

		defaultStockModel[0].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Import ImportBox54
		defaultStockModel[0].setRotationPoint(-6F, -5.5F, -0.5F);

		defaultStockModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -1F, -0.125F, 0F, -1F, -0.125F, 0F, 0F, -0.125F); // Import ImportBox55
		defaultStockModel[1].setRotationPoint(-3F, -4.5F, -0.5F);

		defaultStockModel[2].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Import ImportBox56
		defaultStockModel[2].setRotationPoint(-7F, -4.5F, -0.5F);

		defaultStockModel[3].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -1.75F, 0F, -0.125F, -1.75F, 0F, -0.125F, 0F, 0F, -0.125F); // Import ImportBox57
		defaultStockModel[3].setRotationPoint(-7F, -3.5F, -0.5F);

		defaultStockModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.875F, 0F, 0F, -0.875F); // Import ImportBox58
		defaultStockModel[4].setRotationPoint(-7F, -4.5F, -0.5F);

		defaultStockModel[5].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.875F, -0.75F, 0F, -0.875F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.875F, -0.75F, 0F, -0.875F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox59
		defaultStockModel[5].setRotationPoint(-7F, -4.5F, -0.5F);

		defaultStockModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Import ImportBox49
		defaultStockModel[6].setRotationPoint(-7F, -5.5F, -0.5F);

		defaultStockModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox50
		defaultStockModel[7].setRotationPoint(-7F, -5.5F, -0.5F);

		defaultStockModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F); // Import ImportBox51
		defaultStockModel[8].setRotationPoint(-7F, -5.5F, -0.5F);

		defaultStockModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.875F, -0.125F, 0F, -0.875F, -0.125F, 0F, -0.875F, -0.125F, 0F, -0.875F, -0.125F); // Import ImportBox52
		defaultStockModel[9].setRotationPoint(-7F, -5.5F, -0.5F);


		ammoModel = new ModelRendererTurbo[2];
		ammoModel[0] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import ImportBox22
		ammoModel[1] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Import ImportBox23

		ammoModel[0].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0.5F, 0F, -0.125F, 0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F); // Import ImportBox22
		ammoModel[0].setRotationPoint(5.1F, -3F, -0.5F);

		ammoModel[1].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0.25F, -0.25F, -0.125F, 0.25F, -0.25F, -0.125F, -0.5F, 0F, -0.125F); // Import ImportBox23
		ammoModel[1].setRotationPoint(6.1F, -1F, -0.5F);


		slideModel = new ModelRendererTurbo[1];
		slideModel[0] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Import ImportBox15

		slideModel[0].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Import ImportBox15
		slideModel[0].setRotationPoint(4F, -5.5F, -0.5F);



		scopeAttachPoint = new Vector3f(3F /16F, 0F /16F, 0F /16F);

		animationType = EnumAnimationType.BOTTOM_CLIP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}
