package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelSPAS extends ModelGun
{
	int textureX = 512;
	int textureY = 64;

	public ModelSPAS() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[54];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 6, 24, textureX, textureY); // Box 3
		gunModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 4
		gunModel[3] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 5
		gunModel[4] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 6
		gunModel[5] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 13
		gunModel[6] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 14
		gunModel[7] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 15
		gunModel[8] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 22
		gunModel[9] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 73
		gunModel[10] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 88
		gunModel[11] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 92
		gunModel[12] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 93
		gunModel[13] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 94
		gunModel[14] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 95
		gunModel[15] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 96
		gunModel[16] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 97
		gunModel[17] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 98
		gunModel[18] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 99
		gunModel[19] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 100
		gunModel[20] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 102
		gunModel[21] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 103
		gunModel[22] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 104
		gunModel[23] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 105
		gunModel[24] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 106
		gunModel[25] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 108
		gunModel[26] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 109
		gunModel[27] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 111
		gunModel[28] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 116
		gunModel[29] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 118
		gunModel[30] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 121
		gunModel[31] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 122
		gunModel[32] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 123
		gunModel[33] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 124
		gunModel[34] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 125
		gunModel[35] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 126
		gunModel[36] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 127
		gunModel[37] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 128
		gunModel[38] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 129
		gunModel[39] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 130
		gunModel[40] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 131
		gunModel[41] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 132
		gunModel[42] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 133
		gunModel[43] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 134
		gunModel[44] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 135
		gunModel[45] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 136
		gunModel[46] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 137
		gunModel[47] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 138
		gunModel[48] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 139
		gunModel[49] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 140
		gunModel[50] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 141
		gunModel[51] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 142
		gunModel[52] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 144
		gunModel[53] = new ModelRendererTurbo(this, 83, 27, textureX, textureY); // Box 145

		gunModel[0].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[0].setRotationPoint(1F, -3.3F, -0.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 33, 12, 1, 0F, 0F, 0.2F, 0.3F, -22F, 0.2F, 0.3F, -22F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, -9.8F, 0.3F, -22F, -9.8F, 0.3F, -22F, -9.8F, 0.3F, 0F, -9.8F, 0.3F); // Box 3
		gunModel[1].setRotationPoint(10F, -5.3F, -0.5F);

		gunModel[2].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 4
		gunModel[2].setRotationPoint(21F, -5.3F, -0.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F); // Box 5
		gunModel[3].setRotationPoint(21F, -4.3F, -0.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1F, -0.25F); // Box 6
		gunModel[4].setRotationPoint(4F, -3.3F, -0.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0.5F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		gunModel[5].setRotationPoint(3F, -4.3F, -1.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		gunModel[6].setRotationPoint(3F, -4.3F, -0.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		gunModel[7].setRotationPoint(2F, -6.3F, -0.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0.3F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, -0.5F, 0.3F, 0.3F, -0.5F, -1.2F, 0.3F, 0F, -1.2F, 0.3F, 0F, -1.2F, 0.3F, -0.5F, -1.2F, 0.3F); // Box 22
		gunModel[8].setRotationPoint(12F, -5.3F, -0.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, -0.8F, -0.25F, -0.4F, -0.4F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 73
		gunModel[9].setRotationPoint(23F, -6.3F, -0.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 1F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, 0F, 1F, 0.2F, 0F, 0.5F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 88
		gunModel[10].setRotationPoint(3F, -5.3F, -1.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 92
		gunModel[11].setRotationPoint(5F, -5.3F, -1.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 1F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.8F, 1F, 0.2F, -0.8F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0.5F, 0F, -0.8F); // Box 93
		gunModel[12].setRotationPoint(3F, -5.3F, 0.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0.5F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 94
		gunModel[13].setRotationPoint(3F, -4.3F, 0.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F); // Box 95
		gunModel[14].setRotationPoint(1F, -5.3F, -0.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -1.25F, 0F, 0F, -0.8F, 0.2F, 0F, -0.8F, 0.2F, 0F, -1.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.2F, 0F, 0.25F, 0.2F, 0F, 0.25F, 0F); // Box 96
		gunModel[15].setRotationPoint(1F, -6.3F, -0.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 97
		gunModel[16].setRotationPoint(1F, -4.3F, -0.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F); // Box 98
		gunModel[17].setRotationPoint(2F, -4.3F, -0.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, 0.2F, -1F, 0.2F, 0.2F, -1F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 99
		gunModel[18].setRotationPoint(2F, -5.3F, -0.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 100
		gunModel[19].setRotationPoint(3F, -2.3F, -0.5F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, 0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F); // Box 102
		gunModel[20].setRotationPoint(6F, -3.3F, -0.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F); // Box 103
		gunModel[21].setRotationPoint(6F, -3.3F, -0.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0.3F, 0.3F, -0.5F, 0.3F, 0.3F, -0.5F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, -1.2F, 0.3F, -0.5F, -1.2F, 0.3F, -0.5F, -1.2F, 0.3F, 0F, -1.2F, 0.3F); // Box 104
		gunModel[22].setRotationPoint(10F, -5.3F, -0.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.8F, 0.2F, 0F, -0.8F, 0.2F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		gunModel[23].setRotationPoint(5F, -6.3F, -0.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0.2F, -1F, 0F, 0.2F, -1F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -1F, 0F, 0.2F, -1F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 106
		gunModel[24].setRotationPoint(9F, -4.3F, -0.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, -1F, -0.8F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.8F, 0F, 0F, -0.8F); // Box 108
		gunModel[25].setRotationPoint(-2F, -5.3F, 0.5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, -0.8F, -0.75F, -0.25F, -0.8F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.8F, -0.75F, -0.25F, -0.8F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 109
		gunModel[26].setRotationPoint(-7F, -4.3F, -1.5F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F); // Box 111
		gunModel[27].setRotationPoint(-9F, -4.3F, 0.5F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.25F, -0.8F, 0.25F, -0.25F, -0.8F, 0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.8F, 0.25F, -0.25F, -0.8F, 0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Box 116
		gunModel[28].setRotationPoint(-7F, -4.3F, -1.5F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.25F, -0.8F, 0.25F, -0.25F, -0.8F, 0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.8F, 0.25F, -0.25F, -0.8F, 0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Box 118
		gunModel[29].setRotationPoint(-6F, -4.3F, -1.5F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.25F, -0.8F, 0.25F, -0.25F, -0.8F, 0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.8F, 0.25F, -0.25F, -0.8F, 0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Box 121
		gunModel[30].setRotationPoint(-5F, -4.3F, -1.5F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.25F, -0.8F, 0F, -0.25F, -0.8F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.8F, 0F, -0.25F, -0.8F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Box 122
		gunModel[31].setRotationPoint(-4F, -4.3F, -1.5F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.8F, 0F, -0.75F, -0.8F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 123
		gunModel[32].setRotationPoint(-7F, -4.3F, -1.5F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.75F, -0.8F, 0F, -0.75F, -0.8F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		gunModel[33].setRotationPoint(-7F, -4.3F, -1.5F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		gunModel[34].setRotationPoint(-3F, -4.3F, -1.5F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		gunModel[35].setRotationPoint(-8F, -4.3F, -1.5F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 127
		gunModel[36].setRotationPoint(-3F, -4.3F, 0.5F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.8F, 0F, -0.75F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 128
		gunModel[37].setRotationPoint(-7F, -4.3F, 0.5F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.8F, 0F, -0.75F, -0.8F); // Box 129
		gunModel[38].setRotationPoint(-7F, -4.3F, 0.5F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 130
		gunModel[39].setRotationPoint(-8F, -4.3F, 0.5F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.8F, -0.75F, -0.25F, -0.8F, -0.75F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.8F, -0.75F, -0.25F, -0.8F); // Box 131
		gunModel[40].setRotationPoint(-7F, -4.3F, 0.5F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.8F, 0F, -0.25F, -0.8F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.8F, 0F, -0.25F, -0.8F); // Box 132
		gunModel[41].setRotationPoint(-7F, -4.3F, 0.5F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.8F, -0.75F, -0.25F, -0.8F, -0.75F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.8F, -0.75F, -0.25F, -0.8F); // Box 133
		gunModel[42].setRotationPoint(-6F, -4.3F, 0.5F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.8F, -0.75F, -0.25F, -0.8F, -0.75F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.8F, -0.75F, -0.25F, -0.8F); // Box 134
		gunModel[43].setRotationPoint(-5F, -4.3F, 0.5F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.8F, -0.75F, -0.25F, -0.8F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.8F, -0.75F, -0.25F, -0.8F); // Box 135
		gunModel[44].setRotationPoint(-4F, -4.3F, 0.5F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, -1F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.8F, 0F, -1F, -0.8F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 136
		gunModel[45].setRotationPoint(-2F, -5.3F, -1.5F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		gunModel[46].setRotationPoint(-9F, -4.3F, -1.5F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.7F, 0.1F, 0.3F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0.3F, -0.7F, 0.1F, 0.3F, -0.7F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.7F, 0F, 0.3F); // Box 138
		gunModel[47].setRotationPoint(-10F, -4.3F, -0.5F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 139
		gunModel[48].setRotationPoint(-9F, -4.3F, -0.5F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		gunModel[49].setRotationPoint(-9F, -4.3F, -0.5F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.8F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.8F, 0F, -0.2F); // Box 141
		gunModel[50].setRotationPoint(-9F, -4.3F, -0.5F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 142
		gunModel[51].setRotationPoint(7F, -4.3F, -0.5F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0.2F, -1F, 0F, 0.2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, -1F, 0F, 0.2F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 144
		gunModel[52].setRotationPoint(9F, -5.3F, -0.5F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, -0.05F, -0.8F, -0.05F, -8.05F, -0.8F, -0.05F, -8.05F, -0.8F, -0.05F, -0.05F, -0.8F, -0.05F, -0.05F, 0F, -0.05F, -8.05F, 0F, -0.05F, -8.05F, 0F, -0.05F, -0.05F, 0F, -0.05F); // Box 145
		gunModel[53].setRotationPoint(2F, -6.5F, -0.5F);


		defaultScopeModel = new ModelRendererTurbo[3];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 75
		defaultScopeModel[1] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 77
		defaultScopeModel[2] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 78

		defaultScopeModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, 0F, -0.8F, -0.25F, 0F, -0.8F, -0.25F, -0.8F, 0F, -0.25F, -0.8F, 0F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, -0.8F, 0F, -0.2F, -0.8F); // Box 75
		defaultScopeModel[0].setRotationPoint(10F, -6.4F, -0.5F);

		defaultScopeModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, -0.8F, -0.8F, -0.25F, -0.8F, -0.8F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.2F, -0.8F, -0.8F, -0.2F, -0.8F, -0.8F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 77
		defaultScopeModel[1].setRotationPoint(10F, -6.4F, -0.5F);

		defaultScopeModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.6F, -0.2F, -0.8F, -0.6F, -0.2F, -0.8F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 78
		defaultScopeModel[2].setRotationPoint(10F, -6.4F, -0.5F);


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 143

		ammoModel[0].addShapeBox(0F, 0F, 0F, 14, 6, 6, 0F, 0F, -0.125F, -0.125F, -12F, -0.125F, -0.125F, -12F, -0.125F, -5.125F, 0F, -0.125F, -5.125F, 0F, -5.125F, -0.125F, -12F, -5.125F, -0.125F, -12F, -5.125F, -5.125F, 0F, -5.125F, -5.125F); // Box 143
		ammoModel[0].setRotationPoint(7F, -4.3F, -0.5F);


		pumpModel = new ModelRendererTurbo[11];
		pumpModel[0] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 24
		pumpModel[1] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 25
		pumpModel[2] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 26
		pumpModel[3] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 29
		pumpModel[4] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 32
		pumpModel[5] = new ModelRendererTurbo(this, 224, 19, textureX, textureY); // Box 37
		pumpModel[6] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 49
		pumpModel[7] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 88
		pumpModel[8] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 90
		pumpModel[9] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 91
		pumpModel[10] = new ModelRendererTurbo(this, 85, 35, textureX, textureY); // Box 146

		pumpModel[0].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, -0.2F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -0.2F, -0.5F, 0.5F); // Box 24
		pumpModel[0].setRotationPoint(13F, -3.4F, -0.5F);

		pumpModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.3F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F, -0.5F, 0F, 0.3F, -0.5F); // Box 25
		pumpModel[1].setRotationPoint(20F, -4.4F, 0.5F);

		pumpModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.3F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0.3F, -0.3F, 0F, 0.3F, -0.3F); // Box 26
		pumpModel[2].setRotationPoint(20F, -4.4F, -1.5F);

		pumpModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.5F, 0.5F); // Box 29
		pumpModel[3].setRotationPoint(16F, -3.4F, -0.5F);

		pumpModel[4].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.3F, 0.5F, 0.2F, -0.3F, 0.5F, 0.2F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F); // Box 32
		pumpModel[4].setRotationPoint(17F, -3.4F, -0.5F);

		pumpModel[5].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0.3F, -0.5F); // Box 37
		pumpModel[5].setRotationPoint(13F, -4.4F, -1.5F);

		pumpModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -1F, -0.3F, -0.8F, -1.25F, -0.3F, -0.8F, -1.25F, -0.5F, 0F, -1F, -0.5F, 0F, 0.3F, -0.3F, -0.8F, 0.3F, -0.3F, -0.8F, 0.3F, -0.5F, 0F, 0.3F, -0.5F); // Box 49
		pumpModel[6].setRotationPoint(21F, -4.4F, 0.5F);

		pumpModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -1F, -0.5F, -0.8F, -1.25F, -0.5F, -0.8F, -1.25F, -0.3F, 0F, -1F, -0.3F, 0F, 0.3F, -0.5F, -0.8F, 0.3F, -0.5F, -0.8F, 0.3F, -0.3F, 0F, 0.3F, -0.3F); // Box 88
		pumpModel[7].setRotationPoint(21F, -4.4F, -1.5F);

		pumpModel[8].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 90
		pumpModel[8].setRotationPoint(7F, -5.3F, -0.5F);

		pumpModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		pumpModel[9].setRotationPoint(5F, -5.3F, -0.5F);

		pumpModel[10].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, -0.05F, 0F, -0.05F, -3.05F, 0F, -0.05F, -3.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, -0.8F, -0.05F, -3.05F, -0.8F, -0.05F, -3.05F, -0.8F, -0.05F, -0.05F, -0.8F, -0.05F); // Box 146
		pumpModel[10].setRotationPoint(13.2F, -2.9F, -0.5F);



		scopeAttachPoint = new Vector3f(3F /16F, 0F /16F, 0F /16F);

		animationType = EnumAnimationType.SHOTGUN;
                               
                                tiltGunTime = 0.150F;
                                unloadClipTime = 0.0F;
                                loadClipTime = 0.700F;
                                untiltGunTime = 0.150F;
       

		gripIsOnPump = true;


		numBulletsInReloadAnimation = 7F;


		pumpDelayAfterReload = 121;


		pumpDelay = 12;


		pumpTime = 3;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}