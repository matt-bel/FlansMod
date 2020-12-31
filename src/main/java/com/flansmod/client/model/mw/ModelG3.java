package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelG3 extends ModelGun 
{
	int textureX = 512;
	int textureY = 32;

	public ModelG3() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[33];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 4
		gunModel[5] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 5
		gunModel[6] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 6
		gunModel[7] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 8
		gunModel[8] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 9
		gunModel[9] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 19
		gunModel[10] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 21
		gunModel[11] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 22
		gunModel[12] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 23
		gunModel[13] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 24
		gunModel[14] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 25
		gunModel[15] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 26
		gunModel[16] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 27
		gunModel[17] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 33
		gunModel[18] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 34
		gunModel[19] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 35
		gunModel[20] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 37
		gunModel[21] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 38
		gunModel[22] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 39
		gunModel[23] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 40
		gunModel[24] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 43
		gunModel[25] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 44
		gunModel[26] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 46
		gunModel[27] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 47
		gunModel[28] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 50
		gunModel[29] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 51
		gunModel[30] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 48
		gunModel[31] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 49
		gunModel[32] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 50

		gunModel[0].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[0].setRotationPoint(0F, -3F, -0.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, 0F, -0.5F, -0.25F); // Box 1
		gunModel[1].setRotationPoint(3F, -3F, -0.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 2
		gunModel[2].setRotationPoint(2F, -2F, -0.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 3
		gunModel[3].setRotationPoint(4.25F, -3F, -0.5F);

		gunModel[4].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 4
		gunModel[4].setRotationPoint(1F, -4F, -0.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, -0.375F, 0F); // Box 5
		gunModel[5].setRotationPoint(0F, -4F, -0.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		gunModel[6].setRotationPoint(0F, -5F, -0.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 8
		gunModel[7].setRotationPoint(0F, -5.25F, -1.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, -0.5F, -0.75F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -0.75F, 0.5F, -0.25F, -0.75F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 9
		gunModel[8].setRotationPoint(0F, -5F, -1.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 19
		gunModel[9].setRotationPoint(6F, -4F, -0.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, 0F, -0.5F, -0.375F, 0F); // Box 21
		gunModel[10].setRotationPoint(8F, -5.25F, -1.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 22
		gunModel[11].setRotationPoint(8F, -5F, -1.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, -0.75F, -0.5F, -0.375F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F); // Box 23
		gunModel[12].setRotationPoint(8F, -5F, 0.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, -0.75F, -0.5F, -0.375F, -0.75F); // Box 24
		gunModel[13].setRotationPoint(8F, -5.25F, 0.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 25
		gunModel[14].setRotationPoint(0F, -5.25F, 0.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 26
		gunModel[15].setRotationPoint(0F, -5F, 0.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 27
		gunModel[16].setRotationPoint(6F, -5F, -0.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0.025F, 0F, -0.5F, 0.025F, 0F, -0.5F, 0.025F, 0F, 0F, 0.025F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 33
		gunModel[17].setRotationPoint(6F, -4.75F, -0.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.475F, -0.75F, 0.5F, -0.475F, -0.75F, 0.5F, -0.475F, 0F, 0F, -0.475F, 0F, 0F, -0.5F, -0.75F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 34
		gunModel[18].setRotationPoint(6F, -5.25F, -1.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 35
		gunModel[19].setRotationPoint(0F, -6F, -0.5F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 37
		gunModel[20].setRotationPoint(8F, -5F, -0.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 38
		gunModel[21].setRotationPoint(9F, -5F, -0.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F); // Box 39
		gunModel[22].setRotationPoint(9F, -5F, -0.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F, 0F, -1.25F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, -0.75F, 0F, -1.25F, -0.75F, 0F, -0.75F, 0F, 0F, -0.25F, 0F); // Box 40
		gunModel[23].setRotationPoint(9F, -5F, -1.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, -0.75F, 0F, -1.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -1.25F, -0.75F, 0F, -0.75F, -0.75F); // Box 43
		gunModel[24].setRotationPoint(9F, -5F, 0.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, -0.1F, -0.8F, -0.05F, -5F, -0.8F, -0.05F, -5F, -0.8F, -0.05F, -0.05F, -0.8F, -0.05F, -0.05F, 0F, -0.05F, -5F, 0F, -0.05F, -5F, 0F, -0.05F, -0.05F, 0F, -0.05F); // Box 44
		gunModel[25].setRotationPoint(5F, -6.5F, -0.5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 46
		gunModel[26].setRotationPoint(8F, -6F, -1.5F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.8F, -0.125F, 0.5F, -0.8F, -0.125F, 0.5F, -0.8F, -0.125F, 0F, -0.8F, -0.125F, 0F, 0F, -0.125F, 0.5F, 0F, -0.125F, 0.5F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 47
		gunModel[27].setRotationPoint(0.5F, -6.5F, -0.5F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 50
		gunModel[28].setRotationPoint(17F, -5F, -0.5F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 51
		gunModel[29].setRotationPoint(17F, -6F, -0.5F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Box 48
		gunModel[30].setRotationPoint(8F, -6F, 0.5F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.05F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.05F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.05F, 0F, 0F); // Box 49
		gunModel[31].setRotationPoint(5F, -6F, -1.5F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.05F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -0.05F, -0.5F, -0.75F, -0.05F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.05F, 0F, -0.75F); // Box 50
		gunModel[32].setRotationPoint(5F, -6F, 0.5F);


		defaultScopeModel = new ModelRendererTurbo[7];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 48
		defaultScopeModel[1] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 49
		defaultScopeModel[2] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 52
		defaultScopeModel[3] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 53
		defaultScopeModel[4] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 54
		defaultScopeModel[5] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 55
		defaultScopeModel[6] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 56

		defaultScopeModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.3F, -0.75F, -0.25F, -0.3F, -0.75F, -0.25F, -0.3F, -0.125F, 0F, -0.3F, -0.125F, 0F, -0.2F, -0.75F, -0.25F, -0.2F, -0.75F, -0.25F, -0.2F, -0.125F, 0F, -0.2F, -0.125F); // Box 48
		defaultScopeModel[0].setRotationPoint(0.5F, -6.5F, -0.5F);

		defaultScopeModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.3F, -0.125F, -0.25F, -0.3F, -0.125F, -0.25F, -0.3F, -0.75F, 0F, -0.3F, -0.75F, 0F, -0.2F, -0.125F, -0.25F, -0.2F, -0.125F, -0.25F, -0.2F, -0.75F, 0F, -0.2F, -0.75F); // Box 49
		defaultScopeModel[1].setRotationPoint(0.5F, -6.5F, -0.5F);

		defaultScopeModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.9F, -0.1F, -0.25F, -0.9F, -0.1F, -0.25F, -0.9F, -0.1F, 0F, -0.9F, -0.1F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 52
		defaultScopeModel[2].setRotationPoint(17F, -6.5F, -0.5F);

		defaultScopeModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.15F, -0.2F, -0.1F, -0.35F, -0.2F, -0.1F, -0.35F, -0.2F, -0.8F, 0.15F, -0.2F, -0.8F, 0F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.8F, 0F, -0.1F, -0.8F); // Box 53
		defaultScopeModel[3].setRotationPoint(17F, -6.5F, -0.5F);

		defaultScopeModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.15F, -0.2F, -0.8F, -0.35F, -0.2F, -0.8F, -0.35F, -0.2F, -0.1F, 0.15F, -0.2F, -0.1F, 0F, -0.1F, -0.8F, -0.25F, -0.1F, -0.8F, -0.25F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 54
		defaultScopeModel[4].setRotationPoint(17F, -6.5F, -0.5F);

		defaultScopeModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.2F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.15F, -0.9F, -0.1F, -0.35F, -0.9F, -0.1F, -0.35F, -0.9F, -0.1F, 0.15F, -0.9F, -0.1F); // Box 55
		defaultScopeModel[5].setRotationPoint(17F, -6.4F, -0.5F);

		defaultScopeModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.45F, -0.75F, -0.5F, -0.45F, -0.75F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.1F, -0.45F, -0.75F, -0.1F, -0.45F, -0.75F, -0.1F, -0.45F, 0F, -0.1F, -0.45F); // Box 56
		defaultScopeModel[6].setRotationPoint(17.25F, -6.5F, -0.5F);


		defaultStockModel = new ModelRendererTurbo[8];
		defaultStockModel[0] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 10
		defaultStockModel[1] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 11
		defaultStockModel[2] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 12
		defaultStockModel[3] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 13
		defaultStockModel[4] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 14
		defaultStockModel[5] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 15
		defaultStockModel[6] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 16
		defaultStockModel[7] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 36

		defaultStockModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		defaultStockModel[0].setRotationPoint(-1F, -5F, -0.5F);

		defaultStockModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.625F, -0.95F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, -0.625F, 0F, 0F, -0.375F, -0.95F, 0F, -0.375F, -0.75F, 0F, -0.375F, 0F, 0F, -0.375F, 0F); // Box 11
		defaultStockModel[1].setRotationPoint(-1F, -5.25F, -1.5F);

		defaultStockModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.375F, -0.95F, 0F, -0.375F, -0.75F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.625F, -0.95F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		defaultStockModel[2].setRotationPoint(-1F, -5F, -1.5F);

		defaultStockModel[3].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		defaultStockModel[3].setRotationPoint(-7F, -5F, -0.5F);

		defaultStockModel[4].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 14
		defaultStockModel[4].setRotationPoint(-7F, -4F, -0.5F);

		defaultStockModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.625F, -0.95F); // Box 15
		defaultStockModel[5].setRotationPoint(-1F, -5F, 0.5F);

		defaultStockModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.625F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.625F, -0.95F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.95F); // Box 16
		defaultStockModel[6].setRotationPoint(-1F, -5.25F, 0.5F);

		defaultStockModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -1F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -1F, -0.125F, 0F, 0F, -0.125F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.125F); // Box 36
		defaultStockModel[7].setRotationPoint(-1F, -6F, -0.5F);


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 20

		ammoModel[0].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.5F, -0.5F, -0.1F, 0.5F, -0.5F, -0.1F, 0F, 0F, -0.1F); // Box 20
		ammoModel[0].setRotationPoint(6F, -4F, -0.5F);


		slideModel = new ModelRendererTurbo[1];
		slideModel[0] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 32

		slideModel[0].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.25F, -0.125F, -0.5F, -0.25F, -0.125F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.275F, -0.125F, -0.5F, -0.275F, -0.125F, -0.5F, -0.275F, -0.5F, 0F, -0.275F, -0.5F); // Box 32
		slideModel[0].setRotationPoint(6F, -5.5F, -0.5F);



		barrelAttachPoint = new Vector3f(5F /16F, -0.25F /16F, 0F /16F);

		scopeAttachPoint = new Vector3f(6F /16F, 0F /16F, 0F /16F);

		animationType = EnumAnimationType.BOTTOM_CLIP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}