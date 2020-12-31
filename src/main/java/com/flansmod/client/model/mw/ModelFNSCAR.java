package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelFNSCAR extends ModelGun 
{
	int textureX = 512;
	int textureY = 32;

	public ModelFNSCAR() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[34];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 5
		gunModel[5] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 7
		gunModel[6] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 8
		gunModel[7] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 11
		gunModel[8] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 12
		gunModel[9] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 13
		gunModel[10] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 14
		gunModel[11] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 15
		gunModel[12] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 16
		gunModel[13] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 18
		gunModel[14] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 19
		gunModel[15] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 21
		gunModel[16] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 24
		gunModel[17] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 25
		gunModel[18] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 26
		gunModel[19] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 27
		gunModel[20] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 28
		gunModel[21] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 29
		gunModel[22] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 30
		gunModel[23] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 31
		gunModel[24] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 32
		gunModel[25] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 33
		gunModel[26] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 34
		gunModel[27] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 35
		gunModel[28] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 47
		gunModel[29] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 48
		gunModel[30] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 49
		gunModel[31] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 50
		gunModel[32] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 52
		gunModel[33] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 49

		gunModel[0].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[0].setRotationPoint(0F, -3F, -0.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 1
		gunModel[1].setRotationPoint(3F, -3F, -0.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 2
		gunModel[2].setRotationPoint(2F, -2F, -0.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 3
		gunModel[3].setRotationPoint(5F, -3F, -0.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0.75F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 5
		gunModel[4].setRotationPoint(1F, -4F, -0.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 7
		gunModel[5].setRotationPoint(-1F, -4F, -0.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		gunModel[6].setRotationPoint(-1F, -5F, -0.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		gunModel[7].setRotationPoint(-1F, -6F, -0.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 12
		gunModel[8].setRotationPoint(8F, -5F, -0.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, -0.8F, 0.5F, 0F, -0.8F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.8F, 0.5F, 0.5F, -0.8F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 13
		gunModel[9].setRotationPoint(0F, -5F, -1.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.8F, 0F, 0.5F, -0.8F); // Box 14
		gunModel[10].setRotationPoint(0F, -5F, 0.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.8F, 0F, 0.5F, -0.8F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.8F, 0F, 0.5F, -0.8F); // Box 15
		gunModel[11].setRotationPoint(-1F, -5F, 0.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.5F, -0.8F, 0F, 0.5F, -0.8F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.8F, 0F, 0.5F, -0.8F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 16
		gunModel[12].setRotationPoint(-1F, -5F, -1.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 18
		gunModel[13].setRotationPoint(5.5F, -4F, -1.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 19
		gunModel[14].setRotationPoint(5.5F, -5F, -1.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0.5F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, -0.8F, 0F, 0.5F, -0.8F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Box 21
		gunModel[15].setRotationPoint(8F, -5F, -1.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.75F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.75F, 0.1F, 0F, 0.75F, 0.1F, 0F, 0.75F, 0.1F, 0F, 0.75F, 0.1F, 0F, 0.75F, 0.1F); // Box 24
		gunModel[16].setRotationPoint(-5F, -6F, -0.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, -0.25F, 0F, -0.6F, -0.25F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 25
		gunModel[17].setRotationPoint(8F, -6F, 0.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.95F, 0F, -0.6F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F); // Box 26
		gunModel[18].setRotationPoint(4F, -6F, 0.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.95F, 0F, -0.6F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F); // Box 27
		gunModel[19].setRotationPoint(9F, -6F, 0.5F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.95F, 0F, -0.6F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F); // Box 28
		gunModel[20].setRotationPoint(10.5F, -6F, 0.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.95F, 0F, -0.6F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F); // Box 29
		gunModel[21].setRotationPoint(12F, -6F, 0.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.6F, -0.95F, 0F, -0.6F, -0.95F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		gunModel[22].setRotationPoint(9F, -6F, -1.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.6F, -0.95F, 0F, -0.6F, -0.95F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		gunModel[23].setRotationPoint(10.5F, -6F, -1.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.6F, -0.95F, 0F, -0.6F, -0.95F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		gunModel[24].setRotationPoint(12F, -6F, -1.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 30, 1, 1, 0F, 0F, -0.8F, -0.05F, -16.05F, -0.8F, -0.05F, -16.05F, -0.8F, -0.05F, 0F, -0.8F, -0.05F, 0F, 0F, -0.05F, -16.05F, 0F, -0.05F, -16.05F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 33
		gunModel[25].setRotationPoint(0F, -6.5F, -0.5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 34
		gunModel[26].setRotationPoint(14F, -4.85F, -0.5F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.275F, -0.25F, 0F, -0.275F, -0.25F, 0F, -0.275F, -0.25F, 0F, -0.275F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F); // Box 35
		gunModel[27].setRotationPoint(14F, -5.6F, -0.5F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.8F, -0.45F, -0.5F, -0.6F, -0.45F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.8F, -0.45F, 0F, -0.6F, -0.45F, 0F, 0F, 0F, 0F, 0F); // Box 47
		gunModel[28].setRotationPoint(5F, -5F, -1.5F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.5F, -0.6F, 0F, -0.5F, -0.8F, 0F, -0.5F, 0F, -0.45F, -0.5F, 0F, -0.45F, 0F, -0.6F, 0F, 0F, -0.8F, 0F, 0F, 0F, -0.45F, 0F, 0F); // Box 48
		gunModel[29].setRotationPoint(7F, -5F, -1.5F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 0F, -0.05F, -5.05F, 0F, -0.05F, -5.05F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.8F, -0.05F, -5.05F, -0.8F, -0.05F, -5.05F, -0.8F, -0.05F, 0F, -0.8F, -0.05F); // Box 49
		gunModel[30].setRotationPoint(9F, -3.5F, -0.5F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, -0.05F, -0.2F, -5.05F, -0.05F, -0.2F, -5.05F, -0.05F, -0.6F, 0F, -0.05F, -0.6F, 0F, -0.05F, -0.2F, -5.05F, -0.05F, -0.2F, -5.05F, -0.05F, -0.6F, 0F, -0.05F, -0.6F); // Box 50
		gunModel[31].setRotationPoint(9F, -4.75F, 0.5F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.8F, 0.2F, 0F, -0.8F, 0.2F, 0F, -0.8F, 0.2F, 0F, -0.8F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 52
		gunModel[32].setRotationPoint(-1F, -6.5F, -0.5F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, -0.05F, -0.6F, -5.05F, -0.05F, -0.6F, -5.05F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.6F, -5.05F, -0.05F, -0.6F, -5.05F, -0.05F, -0.2F, 0F, -0.05F, -0.2F); // Box 49
		gunModel[33].setRotationPoint(9F, -4.75F, -1.5F);


		defaultScopeModel = new ModelRendererTurbo[10];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 36
		defaultScopeModel[1] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 37
		defaultScopeModel[2] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 39
		defaultScopeModel[3] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 40
		defaultScopeModel[4] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 41
		defaultScopeModel[5] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 42
		defaultScopeModel[6] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 43
		defaultScopeModel[7] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 44
		defaultScopeModel[8] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 45
		defaultScopeModel[9] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 46

		defaultScopeModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		defaultScopeModel[0].setRotationPoint(3F, -6.5F, -0.5F);

		defaultScopeModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, -0.925F, 0F, -0.25F, -0.925F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.925F, 0F, 0F, -0.925F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		defaultScopeModel[1].setRotationPoint(3F, -7F, -0.5F);

		defaultScopeModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0.1F, -0.625F, -0.5F, 0.1F, -0.625F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.125F, 0.1F, -0.625F, -0.125F, 0.1F, -0.625F, -0.125F, 0.1F, 0F, -0.125F, 0.1F); // Box 39
		defaultScopeModel[2].setRotationPoint(4F, -6.5F, -0.5F);

		defaultScopeModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.925F, 0F, -0.25F, -0.925F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.925F, 0F, 0F, -0.925F); // Box 40
		defaultScopeModel[3].setRotationPoint(3F, -7F, -0.5F);

		defaultScopeModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, -0.075F, 0F, -0.25F, -0.075F, 0F, -0.25F, -0.075F, 0F, -0.25F, -0.075F, 0F, -0.625F, -0.075F, 0F, -0.625F, -0.075F, 0F, -0.625F, -0.075F, 0F, -0.625F, -0.075F); // Box 41
		defaultScopeModel[4].setRotationPoint(3F, -7F, -0.5F);

		defaultScopeModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.95F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, -0.95F, -0.45F, -0.45F, -0.95F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, -0.95F, -0.45F, -0.45F); // Box 42
		defaultScopeModel[5].setRotationPoint(2.5F, -6.85F, -0.5F);

		defaultScopeModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		defaultScopeModel[6].setRotationPoint(2F, -6.5F, -0.5F);

		defaultScopeModel[7].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 44
		defaultScopeModel[7].setRotationPoint(0F, -6.75F, -1.75F);

		defaultScopeModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 45
		defaultScopeModel[8].setRotationPoint(2F, -6.5F, -1.5F);

		defaultScopeModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		defaultScopeModel[9].setRotationPoint(2F, -6.5F, -1.5F);


		defaultStockModel = new ModelRendererTurbo[3];
		defaultStockModel[0] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 9
		defaultStockModel[1] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 22
		defaultStockModel[2] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 23

		defaultStockModel[0].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 9
		defaultStockModel[0].setRotationPoint(-7F, -5.5F, -0.5F);

		defaultStockModel[1].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -1F, 0F, -0.125F, -1F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 22
		defaultStockModel[1].setRotationPoint(-7F, -3.5F, -0.5F);

		defaultStockModel[2].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		defaultStockModel[2].setRotationPoint(-5F, -5.5F, -0.5F);


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 4

		ammoModel[0].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 4
		ammoModel[0].setRotationPoint(5.25F, -3F, -0.5F);



		barrelAttachPoint = new Vector3f(3F /16F, -0.45F /16F, 0F /16F);

		scopeAttachPoint = new Vector3f(3F /16F, 0F /16F, 0F /16F);

		animationType = EnumAnimationType.BULLPUP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}