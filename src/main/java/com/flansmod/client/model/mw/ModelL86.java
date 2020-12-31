package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelL86 extends ModelGun
{
	int textureX = 512;
	int textureY = 128;

	public ModelL86() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[51];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 2
		gunModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 3
		gunModel[3] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 4
		gunModel[4] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 5
		gunModel[5] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 6
		gunModel[6] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 7
		gunModel[7] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 8
		gunModel[8] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 9
		gunModel[9] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 10
		gunModel[10] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 12
		gunModel[11] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 13
		gunModel[12] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 14
		gunModel[13] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 17
		gunModel[14] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 18
		gunModel[15] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 19
		gunModel[16] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 20
		gunModel[17] = new ModelRendererTurbo(this, 188, 26, textureX, textureY); // Box 21
		gunModel[18] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 22
		gunModel[19] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 23
		gunModel[20] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 24
		gunModel[21] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 26
		gunModel[22] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 27
		gunModel[23] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 28
		gunModel[24] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 29
		gunModel[25] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 30
		gunModel[26] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 31
		gunModel[27] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 32
		gunModel[28] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 33
		gunModel[29] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 34
		gunModel[30] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 51
		gunModel[31] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 52
		gunModel[32] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 53
		gunModel[33] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 54
		gunModel[34] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 59
		gunModel[35] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 60
		gunModel[36] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 67
		gunModel[37] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 69
		gunModel[38] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 71
		gunModel[39] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 72
		gunModel[40] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 77
		gunModel[41] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 78
		gunModel[42] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 79
		gunModel[43] = new ModelRendererTurbo(this, 251, 45, textureX, textureY); // Box 60
		gunModel[44] = new ModelRendererTurbo(this, 227, 48, textureX, textureY); // Box 61
		gunModel[45] = new ModelRendererTurbo(this, 186, 58, textureX, textureY); // Box 62
		gunModel[46] = new ModelRendererTurbo(this, 208, 61, textureX, textureY); // Box 63
		gunModel[47] = new ModelRendererTurbo(this, 259, 63, textureX, textureY); // Box 64
		gunModel[48] = new ModelRendererTurbo(this, 191, 32, textureX, textureY); // Box 65
		gunModel[49] = new ModelRendererTurbo(this, 0, 20, textureX, textureY); // Box 66
		gunModel[50] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 67

		gunModel[0].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[0].setRotationPoint(3F, -2.5F, -0.5F);

		gunModel[1].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 2
		gunModel[1].setRotationPoint(4F, -4.5F, -0.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F); // Box 3
		gunModel[2].setRotationPoint(-4F, -4.5F, -0.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 4
		gunModel[3].setRotationPoint(-5F, -5.5F, -0.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 5
		gunModel[4].setRotationPoint(-5F, -3.5F, -0.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 6
		gunModel[5].setRotationPoint(-5F, -4.5F, -0.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F); // Box 7
		gunModel[6].setRotationPoint(-4F, -3.5F, -0.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, -0.25F, -0.25F); // Box 8
		gunModel[7].setRotationPoint(6F, -3.5F, -0.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 9
		gunModel[8].setRotationPoint(6F, -3.5F, -0.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.2F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0.2F, -0.5F, -0.25F); // Box 10
		gunModel[9].setRotationPoint(5F, -2.5F, -0.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F); // Box 12
		gunModel[10].setRotationPoint(7F, -3.5F, -0.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, -0.75F, 0.25F, -0.25F, -0.75F, 0.25F, -0.25F, 0F, 0.5F, -0.25F); // Box 13
		gunModel[11].setRotationPoint(8F, -3.5F, -0.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0.05F, 0.25F, 0F, 0.05F, 0.25F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0.5F, 0.05F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0.5F, 0.05F); // Box 14
		gunModel[12].setRotationPoint(-0.8F, -4F, -0.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, -0.375F, 0.125F, 0F, -0.375F, 0.125F, 0F, -0.375F, 0.125F, 0F, -0.375F, 0.125F); // Box 17
		gunModel[13].setRotationPoint(-2F, -5.5F, -0.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, -0.5F, 0.125F, 0.125F, -0.5F, -0.5F, 0.125F, 0F, -0.5F, 0.125F, 0F, -0.5F, 0.125F, -0.5F, -0.5F, 0.125F); // Box 18
		gunModel[14].setRotationPoint(-4F, -5.5F, -0.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, -0.5F, 0.125F, 0.125F, -0.5F, -0.375F, 0.125F, 0F, -0.375F, 0.125F, 0F, -0.375F, 0.125F, -0.5F, -0.375F, 0.125F); // Box 19
		gunModel[15].setRotationPoint(-3F, -5.5F, -0.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.125F, 0.125F, -0.5F, 0.125F, 0.125F, -0.5F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, -0.5F, 0.125F, -0.5F, -0.375F, 0.125F, -0.5F, -0.375F, 0.125F, 0F, -0.5F, 0.125F); // Box 20
		gunModel[16].setRotationPoint(-3F, -5.5F, -0.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 21
		gunModel[17].setRotationPoint(13F, -4.75F, -0.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 22
		gunModel[18].setRotationPoint(8F, -4.5F, -0.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.5F, -0.75F, 0F); // Box 23
		gunModel[19].setRotationPoint(9F, -3.5F, -0.5F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.5F, -0.375F, -0.25F, 0F, -0.375F, -0.25F, 0F, -0.375F, -0.25F, 0.5F, -0.375F, -0.25F, 0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0.5F, 0F, -0.125F); // Box 24
		gunModel[20].setRotationPoint(9F, -6F, -0.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.25F, -0.5F, -0.375F, -0.25F, -0.5F, -0.375F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 26
		gunModel[21].setRotationPoint(8F, -6F, -0.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, -0.8F, -0.05F, -5.05F, -0.8F, -0.05F, -5.05F, -0.8F, -0.05F, 0F, -0.8F, -0.05F, 0F, 0F, -0.05F, -5.05F, 0F, -0.05F, -5.05F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 27
		gunModel[22].setRotationPoint(0F, -6.5F, -0.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.375F, -0.25F, -0.75F, -0.375F, -0.25F, -0.75F, -0.375F, -0.25F, 0F, -0.375F, -0.25F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 28
		gunModel[23].setRotationPoint(11F, -6F, -0.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 29
		gunModel[24].setRotationPoint(4F, -5.5F, -0.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		gunModel[25].setRotationPoint(4F, -5.5F, -0.5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 31
		gunModel[26].setRotationPoint(4F, -5.5F, -0.5F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 32
		gunModel[27].setRotationPoint(7F, -5.5F, -0.5F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 33
		gunModel[28].setRotationPoint(6F, -5.5F, -0.5F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 34
		gunModel[29].setRotationPoint(5F, -5.5F, -0.5F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 51
		gunModel[30].setRotationPoint(-4F, -5.5F, -0.5F);

		gunModel[31].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 52
		gunModel[31].setRotationPoint(3F, -5.5F, -0.5F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 53
		gunModel[32].setRotationPoint(0F, -5.5F, -0.5F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.75F, -0.5F, -0.8F, -0.75F); // Box 54
		gunModel[33].setRotationPoint(0F, -5.5F, -0.5F);

		gunModel[34].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 59
		gunModel[34].setRotationPoint(4F, -3.5F, -0.5F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.8F, -0.15F, -0.5F, -0.8F, -0.15F, -0.5F, -0.8F, -0.15F, 0F, -0.8F, -0.15F); // Box 60
		gunModel[35].setRotationPoint(8.5F, -5.5F, -0.5F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.8F, -0.15F, -0.5F, -0.8F, -0.15F, -0.5F, -0.8F, -0.15F, 0F, -0.8F, -0.15F); // Box 67
		gunModel[36].setRotationPoint(9.25F, -5.5F, -0.5F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.8F, -0.15F, -0.5F, -0.8F, -0.15F, -0.5F, -0.8F, -0.15F, 0F, -0.8F, -0.15F); // Box 69
		gunModel[37].setRotationPoint(10F, -5.5F, -0.5F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.8F, -0.15F, -0.5F, -0.8F, -0.15F, -0.5F, -0.8F, -0.15F, 0F, -0.8F, -0.15F); // Box 71
		gunModel[38].setRotationPoint(10.75F, -5.5F, -0.5F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.2F, -0.9F, -0.5F, -0.2F, -0.9F, -0.5F, -0.2F, -0.9F, 0F, -0.2F, -0.9F, 0F, -0.5F, -0.85F, -0.5F, -0.5F, -0.85F, -0.5F, -0.5F, -0.85F, 0F, -0.5F, -0.85F); // Box 72
		gunModel[39].setRotationPoint(8.5F, -5F, -1.5F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.2F, -0.9F, -0.5F, -0.2F, -0.9F, -0.5F, -0.2F, -0.9F, 0F, -0.2F, -0.9F, 0F, -0.5F, -0.85F, -0.5F, -0.5F, -0.85F, -0.5F, -0.5F, -0.85F, 0F, -0.5F, -0.85F); // Box 77
		gunModel[40].setRotationPoint(9.25F, -5F, -1.5F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.2F, -0.9F, -0.5F, -0.2F, -0.9F, -0.5F, -0.2F, -0.9F, 0F, -0.2F, -0.9F, 0F, -0.5F, -0.85F, -0.5F, -0.5F, -0.85F, -0.5F, -0.5F, -0.85F, 0F, -0.5F, -0.85F); // Box 78
		gunModel[41].setRotationPoint(10F, -5F, -1.5F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.2F, -0.9F, -0.5F, -0.2F, -0.9F, -0.5F, -0.2F, -0.9F, 0F, -0.2F, -0.9F, 0F, -0.5F, -0.85F, -0.5F, -0.5F, -0.85F, -0.5F, -0.5F, -0.85F, 0F, -0.5F, -0.85F); // Box 79
		gunModel[42].setRotationPoint(10.75F, -5F, -1.5F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 60
		gunModel[43].setRotationPoint(13F, -3.75F, -0.5F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 61
		gunModel[44].setRotationPoint(15.25F, -3.75F, -1F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 62
		gunModel[45].setRotationPoint(13F, -3.75F, -0.5F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 63
		gunModel[46].setRotationPoint(13F, -3.75F, -0.5F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 64
		gunModel[47].setRotationPoint(15.25F, -3.75F, 0F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.25F); // Box 65
		gunModel[48].setRotationPoint(20.75F, -3.75F, -1F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 66
		gunModel[49].setRotationPoint(-2.5F, -4F, -0.5F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 67
		gunModel[50].setRotationPoint(-2.5F, -3.5F, -0.5F);


		ammoModel = new ModelRendererTurbo[8];
		ammoModel[0] = new ModelRendererTurbo(this, 13, 20, textureX, textureY); // Box 68
		ammoModel[1] = new ModelRendererTurbo(this, 13, 20, textureX, textureY); // Box 69
		ammoModel[2] = new ModelRendererTurbo(this, 13, 20, textureX, textureY); // Box 72
		ammoModel[3] = new ModelRendererTurbo(this, 13, 20, textureX, textureY); // Box 73
		ammoModel[4] = new ModelRendererTurbo(this, 13, 20, textureX, textureY); // Box 74
		ammoModel[5] = new ModelRendererTurbo(this, 13, 20, textureX, textureY); // Box 75
		ammoModel[6] = new ModelRendererTurbo(this, 13, 20, textureX, textureY); // Box 76
		ammoModel[7] = new ModelRendererTurbo(this, 13, 20, textureX, textureY); // Box 77

		ammoModel[0].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 68
		ammoModel[0].setRotationPoint(-0.7F, -3.5F, -0.5F);

		ammoModel[1].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		ammoModel[1].setRotationPoint(-0.7F, -2.5F, -0.5F);

		ammoModel[2].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		ammoModel[2].setRotationPoint(-0.7F, -1.5F, -1.5F);

		ammoModel[3].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		ammoModel[3].setRotationPoint(-0.7F, -1.5F, 0.5F);

		ammoModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		ammoModel[4].setRotationPoint(-0.7F, -2.5F, 0.5F);

		ammoModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 75
		ammoModel[5].setRotationPoint(-0.7F, -0.5F, 0.5F);

		ammoModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		ammoModel[6].setRotationPoint(-0.7F, -0.5F, -1.5F);

		ammoModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		ammoModel[7].setRotationPoint(-0.7F, -2.5F, -1.5F);


		slideModel = new ModelRendererTurbo[3];
		slideModel[0] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 55
		slideModel[1] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 56
		slideModel[2] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 58

		slideModel[0].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.75F, 0F, -0.2F, -0.75F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 55
		slideModel[0].setRotationPoint(0F, -5.5F, -0.5F);

		slideModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0.1F, -0.5F, -0.2F, 0.1F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.1F, -0.5F, 0F, 0.1F); // Box 56
		slideModel[1].setRotationPoint(2F, -5.5F, -1.5F);

		slideModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, -0.65F, -0.5F, 0.25F, -0.65F, -0.5F, 0.25F, -0.65F, -0.4F, -1F, -0.65F, -0.4F, -0.5F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F); // Box 58
		slideModel[2].setRotationPoint(2F, -6.5F, -1.5F);



		barrelAttachPoint = new Vector3f(-3F /16F, -1F /16F, 0F /16F);

		scopeAttachPoint = new Vector3f(1F /16F, 0F /16F, 0F /16F);

		animationType = EnumAnimationType.BULLPUP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}
