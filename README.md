# sossResearchCluster
<b>Author:</b> Michael B. Syson<br>
<b>Date:</b> 20160305<br>
<b>Description:</b><br>
This is a set of scripts built for a Research Project related to Knowledge-Transfer with my colleagues Dr. Czarina "Bopeep" Saloma-Akpedonu and Michael "Mike" Pante of the School of Social Sciences at the Ateneo de Manila University.<br>
<b>Includes:</b><br>
1) SeparateToMultiAuthorsReferences<br>

# SeparateToMultiAuthorsReferences
<b>Instructions:</b><br>
Separate multiple-authored publications into their own lines in the output. Keep the same title of the publication.<br>
Publications with only 1 author remain the same.

<b>Input file:</b><br>
Label;Label;Title<br>
"Alston, J.M., G.W. Norton, and P.G. Pardey;Alston, J.M., G.W. Norton, and P.G. Pardey;Science under scarcity: Principles and practice of agricultural research evaluation and priority setting."<br>
<br>
<b>Output file:</b><br>
Label;Label;Title<br>
Alston, J.M;Alston, J.M;Science under scarcity: Principles and practice of agricultural research evaluation and priority setting.<br>
G.W. Norton;G.W. Norton;Science under scarcity: Principles and practice of agricultural research evaluation and priority setting.<br>
P.G. Pardey;P.G. Pardey;Science under scarcity: Principles and practice of agricultural research evaluation and priority setting.<br>

# Open Source Software License
Copyright 2016 Usbong Social Systems, Inc.

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0
  
Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
